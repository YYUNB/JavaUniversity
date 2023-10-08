package JavaProgramming.w10;

import java.util.Scanner;


public class Group{
    Scanner sc = new Scanner(System.in);

    char seatType;
    Seat[] setArr;
    final int size = 10;
    public Group(char seatType) {
        this.seatType = seatType;
        this.setArr = new Seat[size];
        // setArr의 요소를 Seat 객체로 초기화
        for (int i = 0; i < size; i++) setArr[i] = new Seat();
    }

    public void showSeat() {
        System.out.print(seatType + "석 예약 | ");
        for (int i = 0; i < size; i++) {
            if (setArr[i].checkOccupied()) System.out.print(setArr[i].getName() + " ");
            else System.out.print("--- ");
        }
        System.out.println();
    }

    public boolean seatBook() { // 이후 조건문 판단을 위해 예약된 경우 true 리턴
        showSeat();
        System.out.print("이름: ");
        String name = sc.next();
        System.out.print("번호: ");
        int num = sc.nextInt();

        if (num < 1 || num > size) {
            System.out.println("잘못된 좌석 번호입니다.");
            return false;
        }
        if (setArr[num-1].checkOccupied()) {
            System.out.println("이미 예약된 좌석 번호입니다.");
            return false;
        }
        setArr[num-1].setName(name);
        return true;
    }

    public void cancel() {
        showSeat();
        System.out.print("이름: ");
        String name = sc.next();

        if (name != null) {
            for (int i = 0; i < size; i++) {
                if (setArr[i].checkNameEqual(name)) setArr[i].cancel();
            }
        }
        else System.out.println("잘못된 예약자명입니다.");
    }
}
