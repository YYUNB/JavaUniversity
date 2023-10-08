package ch07;
import java.util.Scanner;
class Odd {
    public int oddSum(int o) {
        int sum =0;
        for (int i=1; i <= o; i++) {
            if (i%2==1) sum += i;
        }
        return sum;
    }
}

class OddEven extends Odd {
    public int evenSum(int o) {
        int sum =0;
        for (int i=1; i <= o; i++) {
            if (i%2==0) sum += i;
        }
        return sum;
    }

}
class OddEvenTest {

    public void print(int o, int e) {
        System.out.println("짝수의 합 : " + e);
        System.out.println("홀수의 합 : " + o);
    }
}
public class practice03 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        Odd o = new Odd();
        OddEven oe = new OddEven();
        OddEvenTest oet = new OddEvenTest();

        System.out.print("숫자를 입력하세요 : ");
        int num = stdIn.nextInt();

        int oddsum = o.oddSum(num);
        int evensum = oe.evenSum(num);

        oet.print(oddsum, evensum);
    }
}