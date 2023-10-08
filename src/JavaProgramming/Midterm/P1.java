package Midterm;

import java.util.Scanner;
import java.util.Arrays;

public class P1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[][] arr = {{"JVM", "자바 가상 기계. 상이한 하드웨어와 운영체제를 가진 컴퓨터에서 동일하게 동작하도록 구성"},
                {"Syntax Error", "구문 오류. 컴파일 시간에 발생함"},
                {"Runtime Error", "실행 시간 오류. 실행 시 발생함. JVM에 의해 오류 발생 시 비정상적으로 종료됨"},
                {"Logic Error", "논리 오류. 논리적 문제로 발생함. 0으로 나누거나 배열의 첨자 벗어나는 등의 문제"},
                {"상속", "새로운 클래스를 만들 때 상위 클래스를 지정함으로써 모든 속성과 기능을 상속받음"},
                {"캡슐화", "객체 내부 정보의 손상, 오용을 방지하고 내부 조작법이 바뀌어도 사용법은 바뀌지 않음"},
                {"추상화", "공통 부분을 추출하여 추상 클래스로 제공함. 상속을 이용해 나머지 클래스를 하위 클래스로 제공"},
                {"다형성", "다양한 변신이라는 의미로 서로 다른 객체가 동일한 메시지에 대해 서로 다른 방법으로 응답함"},
                {"Public", "항상 접근 가능함" },
                {"Protected", "자바의 명시적인 접근 한정자"},
                {"Private", "소속된 클래스 내에서만 사용 가능함"}};

        int input = 0;
        int marr[] = new int[12];
        Arrays.fill(marr, 0);
        while(input != -1) {
            System.out.print("입력 (문제 갯수:0~11 / 종료: -1): ");
            input = sc.nextInt();
            for (int i = 0; i< input; i++) {
                int index = (int)(Math.random()*11);
                if (marr[index] == 1) {
                    while (true) {
                        index = (int)(Math.random()*11);
                        if (marr[index] != 1) break;
                    }
                }
                else marr[index] = 1;
                System.out.println(arr[index][0] + "\t\t" + arr[index][1]);
            }
            if (input > 11) System.out.println("잘못입력하였습니다.");
            if (input == -1) System.out.println("프로그램 종료");
        }

    }
}
