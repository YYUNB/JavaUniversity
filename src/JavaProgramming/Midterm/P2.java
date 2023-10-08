package Midterm;

import java.util.Scanner;

public class P2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of Rock Paper Scissors: ");
        int num = sc.nextInt();

        String[][] arr = new String[num+2][4];
        arr[0][0] = "Match";
        arr[0][1] = "Computer";
        arr[0][2] = "Player";
        arr[0][3] = "Result";
        arr[num+1][0] = "Total";
        arr[num+1][3] = "-";
        int comw = 0, userw = 0;
        for (int i = 1; i < num+1; i++) {
            System.out.print("Rock(0), Paper(1), Scissors(2): ");
            int user = sc.nextInt();
            arr[i][0] = Integer.toString(i);
            arr[i][2] = Integer.toString(user);
            int com = (int) (Math.random() * 3);
            arr[i][1] = Integer.toString(com);
            if ((user == 0 && com == 2) || (user == 1 && com == 0) || (user == 2 && com == 1)) {
                userw++;
                arr[i][3] = "Player Win";
            } else if (user == com) arr[i][3] = "Draw";
            else {
                comw++;
                arr[i][3] = "Computer Win";
            }
        }

        arr[num+1][1] = Integer.toString(comw);
        arr[num+1][2] = Integer.toString(userw);
        System.out.println(arr[0][0] + "\t\t" + arr[0][1] + "\t" + arr[0][2] + "\t\t" + arr[0][3]);
        for (int j = 1; j < num+1; j++) {
            System.out.println(arr[j][0] + "\t\t\t" + arr[j][1] + "\t\t\t" + arr[j][2] + "\t\t\t" +arr[j][3]);
        }
        System.out.println(arr[num+1][0] + "\t\t" + arr[num+1][1] + "\t\t\t" + arr[num+1][2] + "\t\t\t" + arr[num+1][3]);
    }
}