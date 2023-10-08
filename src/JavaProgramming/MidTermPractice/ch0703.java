package MidTermPractice;
import java.util.Scanner;


class Odd {
    int getSum(int num) {
        int sum = 0;
        for(int i=1; i<=num; i++) {
            if(i%2 == 1) sum += i;
        }
        return sum;
    }
}

class OddEven extends Odd {
    int getSum(int num) {
        int sum = 0;
        for(int i=1; i<=num; i++) {
            if(i%2==0) sum += i;
        }
        return sum;
    }
}
public class ch0703 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Odd odd = new Odd();
        OddEven even = new OddEven();

        System.out.print("숫자를 입력하세요: ");
        int n = sc.nextInt();

        System.out.println("짝수의 합: " + even.getSum(n));
        System.out.println("홀수의 합: " + odd.getSum(n));
    }
}
