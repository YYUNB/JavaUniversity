package Midterm;
import java.util.Scanner;
import java.util.Arrays;

public class P4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("배열의 크기를 입력하세요: ");
        int n = sc.nextInt();
        int[] arr1 = new int[n];
        int[] arr2 = new int[n];

        for (int i = 0; i < n; i++) {
            arr1[i] = (int)(Math.random()*8);
            arr2[i] = (int)(Math.random()*8);
        }

        System.out.print("Array 1:   ");
        for(int i = 0; i < n; i++){
            System.out.print(arr1[i]+ " ");
        }
        System.out.print("\nArray 2:   ");
        for(int i = 0; i < n; i++){
            System.out.print(arr2[i]+ " ");
        }

        int[] check = new int[n];
        Arrays.fill(check, 0);
        int min = 0;
        for (int i = 0; i < n; i++) {
            int minv = 100000;
            int index = -1;
            for (int j = 0; j < n; j++) {
                if (check[j] == 0 && arr1[i]*arr2[j] < minv) {
                    minv = arr1[i]*arr2[j];
                    index = j;
                }
            }
            check[index] = 1;
            min += minv;
        }
        System.out.println("\n결과: " + min);
    }
}