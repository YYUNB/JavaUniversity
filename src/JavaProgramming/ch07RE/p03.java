package ch07RE;
import java.util.Scanner;

class Odd {
    int oddSum(int num) {
        int sum = 0;
        for (int i=1; i<=num; i++) if(i%2==1) sum += i;
        return sum;
    }
}

class OddEven extends Odd {
    int evenSum(int num) {
        int sum = 0;
        for (int i=1; i<=num; i++) if(i%2==0) sum += i;
        return sum;
    }
}

class OddEvenTest {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        Odd odd = new Odd();
        OddEven even = new OddEven();

        System.out.print("숫자를 입력하세요 : ");
        int num = stdIn.nextInt();

        System.out.println("짝수의 합 : " + even.evenSum(num));
        System.out.println("홀수의 합 : " + odd.oddSum(num));
    }
}

public class p03 {
}
