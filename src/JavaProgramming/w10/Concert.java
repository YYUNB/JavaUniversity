package JavaProgramming.w10;

import java.util.Scanner;

public class Concert {
    public void run() {
        System.out.println("명품콘서트홀 예약 시스템입니다.");

        Scanner sc = new Scanner(System.in);
        Group[] sTypeArr = new Group[4];
        sTypeArr[0] = new Group('S');
        sTypeArr[1] = new Group('A');
        sTypeArr[2] = new Group('B');

        while(true) {
            System.out.print("예약(1), 조회(2), 취소(3), 끝내기(4) >> ");
            int menu = sc.nextInt();
            switch (menu) {
                case 1:
                    System.out.print("좌석 S(1), A(2), B(3) >> ");
                    int seatType = sc.nextInt();
                    if (seatType >= 1 && seatType <= 3) sTypeArr[seatType-1].seatBook();
                    else System.out.println("잘못된 입력입니다");
                    break;
                case 2:
                    for (int i = 0; i < sTypeArr.length-1; i++) sTypeArr[i].showSeat();
                    System.out.println("<<< 조회를 완료하였습니다. >>>");
                    break;
                case 3:
                    System.out.print("좌석 S(1), A(2), B(3) >> ");
                    seatType = sc.nextInt();
                    if(seatType >= 1 && seatType <=3) sTypeArr[seatType-1].cancel();
                    else System.out.println("잘못된 입력입니다.");
                    break;
                case 4:
                    System.out.println("종료합니다.");
                    System.exit(0);
                    break;
                default:
                    System.out.println("잘못된 입력입니다.");
                    break;
            }
        }
    }
}
