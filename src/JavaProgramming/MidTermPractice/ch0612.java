package MidTermPractice;
import  java.util.Scanner;

public class ch0612 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input matrix size (row, col): ");
        int r = sc.nextInt();
        int c = sc.nextInt();

        r++;
        c++;
        String[][] arr = new String[r][c];
        for(int i=0; i<r; i++) for(int j=0; j<c; j++) arr[i][j] = "O";

        for (int i = 0; i < r; i++) arr[i][0] = Integer.toString(i-1);
        for (int i = 0; i < c; i++) arr[0][i] = Integer.toString(i-1);
        arr[0][0] = " ";

        for(int i=0; i<r; i++) {
            for(int j=0; j<c; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        while(true) {
            System.out.print("Row index: ");
            int row = sc.nextInt();
            if (row == 99) {
                System.out.println("End");
                break;
            }
            System.out.print("Column index: ");
            int col = sc.nextInt();

            arr[row+1][col+1] = "X";
            for(int i=0; i<r; i++) {
                for(int j=0; j<c; j++) {
                    System.out.print(arr[i][j] + " ");
                }
                System.out.println();
            }
        }
    }
}
