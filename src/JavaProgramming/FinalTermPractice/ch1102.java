package JavaProgramming.FinalTermPractice;

import java.util.Scanner;

interface Stack {
    int length();  // 현재 스택에 저장된 개수 리턴
    int capacity();  // 스택에 전체 저장 가능한 개수 리턴
    String pop();  // 스택의 톱(top)에 저장된 실수 리턴
    boolean push(String val);  // 스택의 톱(top)에 실수 저장
}

class StringStack implements Stack {
    String[] s;
    int top;

    public StringStack(int capacity) {
        this.s = new String[capacity];
        this.top = -1;
    }

    public int length() {
        return top + 1;
    }

    public int capacity() {
        return s.length;
    }

    public String pop() {
        if (top == -1) return null;
        String popped = s[top];
        s[top] = null;
        top--;
        return popped;
    }

    public boolean push(String val) {
        if (top == s.length - 1) {
            System.out.println("스택이 꽉 차서 푸시 불가!");
            return false;
        }
        top++;
        s[top] = val;
        return true;
    }
}

public class ch1102 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("총 스택 저장 공간의 크기 입력 >> ");
        int size = sc.nextInt();
        StringStack ss = new StringStack(size);

        String data = " ";
        while (!data.equals("그만")) {
            System.out.print("문자열 입력 >> ");
            data = sc.next();
            ss.push(data);
        }

        System.out.print("스택에 저장된 모든 문자열 팝 : ");
        int length = ss.length();  // 저장된 데이터 수만큼만 반복문 돌림
        for (int i = 0; i < length; i++) {
            System.out.print(ss.pop() + " ");
        }
    }
}