package example;
import java.util.Scanner;

public class e0601 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double sum = 0.0, avg;
        double dnum[] = new double[5];
        System.out.println("dnum 배열의 길이: " + dnum.length);
        System.out.print("초기화 하지 않은 dnum[]의 값: ");
        for (int i = 0; i < dnum.length; i++) System.out.print(dnum[i] + " ");
        System.out.println();

        for (int i = 0; i < dnum.length; i++) {
            System.out.print("dnum[" + (i) + "] 번째 데이터 입력: ");
            dnum[i] = sc.nextDouble();
        }
        for (int i = 0; i < dnum.length; i++) sum += dnum[i];
        System.out.println("배열의 합은 " + sum + "입니다.");
        avg = sum / dnum.length;
        System.out.println("배열 값의 평균은 " + avg + "입니다.");
    }
}
