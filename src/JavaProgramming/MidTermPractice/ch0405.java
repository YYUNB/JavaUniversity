package MidTermPractice;
import java.util.Scanner;
public class ch0405 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("가위(0), 바위(1), 보(2): ");
        int user = sc.nextInt();
        int com = (int)(Math.random()*3);
        System.out.print("사람: " + user + ", 컴퓨터: " + com);

        if (user == com) System.out.println(" > 비겼습니다.");
        else if ((user==0&&com==2)||(user==1&&com==0)||(user==2&&com==1)) System.out.println(" > 사람 승리");
        else System.out.println(" > 컴퓨터 승리");
    }
}
