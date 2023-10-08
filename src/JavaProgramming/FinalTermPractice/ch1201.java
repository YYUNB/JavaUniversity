package JavaProgramming.FinalTermPractice;

import java.util.Arrays;
import java.util.Scanner;

public class ch1201 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("== 사용자 입력 데이터 ==");
        String data = sc.nextLine();
        String[] dataArr = data.split(" ");

        Arrays.sort(dataArr);
        System.out.println("== 정렬 후 데이터 ==");
        for (int i = 0; i < dataArr.length; i++) {
            System.out.print(dataArr[i] + " ");
        }


        sc.close();
    }
}
