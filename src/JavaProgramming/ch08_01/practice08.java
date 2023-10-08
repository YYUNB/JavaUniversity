package ch08_01;
import java.util.Scanner;
class Account {
    int money;

    void inputM(int plus) {
        money += plus;
        System.out.println("현재 잔액은 " + money + "입니다.");
    }
    void outM(int minus) {
        if (money >= minus ) {
            money -= minus;
            System.out.println("현재 잔액은 " + money + "입니다.");
        }
        else System.out.println("잔액이 부족합니다.");
    }

    void printM() {
        System.out.println("현재 잔액은 " + money + "입니다.");
    }
}
public class practice08 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        Account act = new Account();

        int PIN = 1234;
        System.out.print("PIN을 입력하시오: ");
        int pin = stdIn.nextInt();

        if (PIN != pin) {
            System.out.println("PIN이 잘못되었습니다.");
            System.exit(0);
        }

        while (PIN == pin) {
            System.out.println("1. 현금 입금");
            System.out.println("2. 현금 인출");
            System.out.println("3. 잔액 확인");
            System.out.println("4. 종료");

            System.out.print("번호를 입력하세요: ");
            int number = stdIn.nextInt();

            switch (number) {
                case 1:
                    System.out.print("입금액: ");
                    int plus_money = stdIn.nextInt();
                    act.inputM(plus_money);
                    break;
                case 2:
                    System.out.print("인출액: ");
                    int minus_money = stdIn.nextInt();
                    act.outM(minus_money);
                    break;
                case 3:
                    act.printM();
                    break;
                case 4:
                    System.out.println("종료합니다.");
                    System.exit(0);
                    break;
            }
            System.out.println();
        }
    }
}
