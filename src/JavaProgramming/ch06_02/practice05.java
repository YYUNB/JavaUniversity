package ch06_02;
import java.util.Scanner;
public class practice05 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        System.out.println("Input matrix size (row, col) : ");
        int rowSize = stdIn.nextInt();
        int colSize = stdIn.nextInt();

        String[][] arr = new String[rowSize+1][colSize+1];
        for(int i=0; i<arr.length; i++) {
            arr[i][0] = Integer.toString(i-1);
            for(int j=0; j<arr[i].length; j++) {
                arr[0][0] = " ";
                if (i > 0 && j > 0) arr[i][j] = "0";
                else if(i==0 && j>0) arr[0][j] = Integer.toString(j-1);
                System.out.print(arr[i][j] + " ");
            }
            System.out.println("");
        }
        System.out.println("");
        while(true) {
            System.out.print("Row index : ");
            int r = stdIn.nextInt();
            if(r == 99) {
                System.out.println("End");
                break;
            }
            System.out.print("Column index : ");
            int c = stdIn.nextInt();

            arr[r+1][c+1] = "x";
            for(int i=0; i<arr.length; i++) {
                for (int j = 0; j < arr[i].length; j++) {
                    System.out.print(arr[i][j] + " ");
                }
                System.out.println("");
            }
            System.out.println("");
        }
    }
}
