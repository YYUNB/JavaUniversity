package MidTermPractice;
import java.util.Scanner;

class Account {
    int balance = 0;

    void deposit(int money) {
        balance += money;
    }

    void withdraw(int money) {
        balance -= money;
    }

    public String toString() {
        return "현재 잔액은 " + balance + "원 입니다.";
    }
}
public class week0701 {
    public static void main(String[] args) {
        int PASSWORD = 1234;

        Scanner sc = new Scanner(System.in);
        Account ac = new Account();

        System.out.print("PIN을 입력: ");
        int pass = sc.nextInt();

        while(pass==PASSWORD) {
            System.out.println("1. 현금 입금");
            System.out.println("2. 현금 인출");
            System.out.println("3. 잔액 확인");
            System.out.println("4. 종료");
            System.out.print("번호를 선택하세요: ");
            int menu = sc.nextInt();

            switch(menu) {
                case 1:
                    System.out.print("입금액: ");
                    int dmoney = sc.nextInt();
                    ac.deposit(dmoney);
                    System.out.println(ac);
                    break;
                case 2:
                    System.out.print("인출액: ");
                    int wmoney = sc.nextInt();
                    if (ac.balance >= wmoney) {
                        ac.withdraw(wmoney);
                        System.out.println(ac);
                    }
                    else System.out.println("잔액이 부족합니다.");
                    break;
                case 3:
                    System.out.println(ac);
                    break;
                case 4:
                    System.out.println("종료합니다.");
                    System.exit(0);
                    break;
            }
            System.out.println();
        }
        System.out.println("PIN이 잘못되었습니다.");
    }
}
