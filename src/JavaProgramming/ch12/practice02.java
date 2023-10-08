package JavaProgramming.ch12;

import java.util.Scanner;

public class practice02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("==사용자 입력 데이터==");
        String str = sc.nextLine();
        String arr[] = str.split(" ");

        System.out.println("==정렬 후 데이터==");
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if(arr[i].compareTo(arr[j]) > 0) {
                    String t = arr[i];
                    arr[i] = arr[j];
                    arr[j] = t;
                }
            }
            System.out.print(arr[i] + " ");
        }

    }
}
