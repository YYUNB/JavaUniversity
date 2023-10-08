package JavaProgramming.ch11;

import java.util.Scanner;

interface Stack {
    int length();  // 현재 스택에 저장된 개수 리턴
    int capacity();  // 스택에 전체 저장 가능한 개수 리턴
    String pop();  // 스택의 톱(top)에 저장된 실수 리턴
    boolean push(String val);  // 스택의 톱(top)에 실수 저장
}

class StringStack implements Stack {
    String[] stack;
    int top;

    public StringStack(int capacity) {
        this.stack = new String[capacity];
        this.top = -1;
    }

    public int length() {
        return top + 1;
    }

    public int capacity() {
        return stack.length;
    }

    public String pop() {
        if (top == -1) return null;
        String popped = stack[top];
        stack[top] = null;
        top--;
        return popped;
    }

    public boolean push(String val) {
        if (top == stack.length - 1) {
            System.out.println("스택이 꽉 차서 푸시 불가!");
            return false;
        }
        top++;
        stack[top] = val;
        return true;
    }
}

public class StackApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("총 스택 저장 공간의 크기 입력 >> ");
        int size = sc.nextInt();
        StringStack ss = new StringStack(size);

        while (true) {
            System.out.print("문자열 입력 >> ");
            String string = sc.next();
            if (string.equals("그만")) break;
            ss.push(string);
        }

        System.out.println("스택에 저장된 모든 문자열 팝:");
        int length = ss.length();
        for (int i = 0; i < length; i++) {
            System.out.print(ss.pop() + " ");
        }
    }
}