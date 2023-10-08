package JavaProgramming.ch11;

import java.util.Scanner;

abstract class Calc {
    protected int a, b;
    public void setValue(int a, int b) {
        this.a = a;
        this.b = b;
    }
    public abstract int calculate();
}

class Calculator extends Calc {
    String s;
    public void setValue(int a, int b) {
        this.a = a;
        this.b = b;
    }
    public void setSymbol(String s) {
        this.s = s;
    }
    public int calculate() {
        if (s.equals("+")) return a+b;
        else if (s.equals("-")) return a-b;
        else if(s.equals("*")) return a*b;
        else if (s.equals("/")) return a/b;
        else return 99999;  // 좀 더 나은 값..???
    }
}

public class CalcTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("두 정수와 연산자를 입력하시오>> ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        String s = sc.next();

        Calculator c = new Calculator();
        c.setValue(a, b);
        c.setSymbol(s);
        if (c.calculate() == 99999) System.out.println("error");
        else System.out.println(c.calculate());
    }
}