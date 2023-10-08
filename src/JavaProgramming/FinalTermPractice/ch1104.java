package JavaProgramming.FinalTermPractice;

import java.util.Scanner;

abstract class Calc {
    protected int a, b;
    public void setValue(int a, int b) {
        this.a = a;
        this.b = b;
    }
    public abstract int calculate();
}

class CalcT extends Calc {
    char c;

    public void setSym(char c) {
        this.c = c;
    }
    public int calculate() {
        switch (c) {
            case '+':
                return a + b;
            case '-':
                return a - b;
            case '*':
                return a * b;
            case '/':
                return a / b;
            default:
                return 0;
        }
    }
}

public abstract class ch1104 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("두 정수와 연산자를 입력하시오>> ");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        char c = sc.next().charAt(0);

        CalcT ct = new CalcT();
        ct.setValue(n1, n2);
        ct.setSym(c);

        System.out.println(ct.calculate());
    }
}
