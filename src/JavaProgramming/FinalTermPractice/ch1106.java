package JavaProgramming.FinalTermPractice;

import java.util.Scanner;

abstract class Shape1 {
    private Shape1 next;
    public Shape1() {
            next = null;
    }
    public void setNext(Shape1 obj) { // 링크 연결
        next = obj;
    }
    public Shape1 getNext() {
        return next;
    }
    public abstract void draw();
}

class Line extends Shape1 {
    @Override
    public void draw() {
        System.out.println("Line");
    }
}
class Rect extends Shape1 {
    @Override
    public void draw() {
        System.out.println("Rect");
    }
}
class Circle3 extends Shape1 {
    @Override
    public void draw() {
        System.out.println("Circle");
    }
}
public class ch1106 {
    private static Shape1 start = null, end = null;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int choice = 0;
        while(choice != 4) {
            System.out.print("삽입(1), 삭제(2), 모두 보기(3), 종료(4)>> ");
            choice = sc.nextInt();
            switch(choice) {
                case 1:
                    System.out.print("[도형 종류] Line(1), Rect(2), Circle(3)>> ");
                    int type = sc.nextInt();
                    if (type < 1 || type > 3) {
                        System.out.println("잘못 선택하셨습니다.");
                        break;
                    }
                    insert(type);
                    break;
                case 2:
                    System.out.print("삭제할 도형의 위치>> ");
                    int index = sc.nextInt();
                    if (!delete(index)) System.out.println("삭제할 수 없습니다.");
                    break;
                case 3:
                    // 모든 객체가 각각의 Shape1 next를 가지고 있는건가? why...
                    Shape1 p = start;
                    while (p != null) {
                        p.draw();
                        p = p.getNext();
                    }
                    break;
                case 4:
                    System.out.println("프로그램을 종료합니다...");
                    break;
                default:
                    System.out.println("잘못 입력하셨습니다.");
            }
        }
        sc.close();
    }

    private static boolean delete(int index) {
        Shape1 current = start, previous = start;
        if (start == null) return false; // 리스트가 빈 경우

        // 이 과정이 왜 필요한거? 인덱스가 리스트 원소 개수보다 큰 지 확인하려고?
        for (int i = 0; i < index ; i++) {
            previous = current;
            current = current.getNext();  // 다음 원소로 이동
            if (current == null) return false;  // 인덱스가 리스트 원소 개수보다 큰 경우
        }

        if (start == end) { // 리스트의 원소가 한개인 경우
            start = end = null;
            return true;
        }

        if (current == start) { // 첫번째 원소를 삭제하는 경우
            start = start.getNext();  // 다음 원소가 첫번째 원소가 됨
        }
        else if (current == end) { // 마지막 원소를 삭제하는 경우
            end = previous;
            end.setNext(null);
        }
        else previous.setNext(current.getNext()); // 현재 원소를 리스트에서 삭제
        return true;
    }

    private static void insert(int choice) {
        Shape1 obj = null;
        switch(choice) {
            case 1:
                obj = new Line();
                break;
            case 2:
                obj = new Rect();
                break;
            case 3:
                obj = new Circle3();
                break;
        }
        if (start == null) start = end = obj; // 리스트가 빈 경우
        else {
            end.setNext(obj);  // 마지막 원소 뒤에 삽입
            end = obj;
        }
    }
}
