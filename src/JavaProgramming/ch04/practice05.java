package ch04;

import java.util.Scanner;

public class practice05 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        int s = 0, r = 1, p = 2;
        System.out.print("가위(0), 바위(1), 보(2) : ");
        int user = stdIn.nextInt();
        int com = (int)Math.random() * 3;
        if ((user==0&&com==2)||(user==1&&com==0)||(user==2&&com==1)) System.out.println("사람: " + user + " 컴퓨터: " + com + "> 사람 승리");
        else if (user == com) System.out.println("사람: " + user + " 컴퓨터: " + com + "> 컴퓨터와 비겼음");
        else System.out.println("사람: " + user + " 컴퓨터: " + com + "> 컴퓨터 승리");
    }
}
