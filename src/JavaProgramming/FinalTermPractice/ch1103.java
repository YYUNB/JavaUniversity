package JavaProgramming.FinalTermPractice;

import java.util.Scanner;

interface Queue {
    boolean isEmpty();
    void Enqueue(int x);
    int Dequeue();

}

class IntQueue implements Queue {
    int q[];
    int top;

    public IntQueue() {
        q = new int[51];
        this.top = -1;
    }
    public boolean isEmpty() {
        if (top < 0) return false;
        else return true;
    }
    public void Enqueue(int x) {
        top++;
        if (top >= 50) System.out.println("큐가 모두 찼습니다.");
        else q[top] = x;
    }
    public int Dequeue() {
        int dq = q[0];
        for (int i = 1; i < top+1; i++) q[i-1] = q[i];
        top--;
        return dq;
    }
}

public class ch1103 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        IntQueue iq = new IntQueue();

        while(true) {
            System.out.print("정수 입력 >> ");
            String menu = sc.next();
            if (menu.equals("출력")) break;
            int data = Integer.parseInt(menu);
            iq.Enqueue(data);
        }

        System.out.println("큐에 저장된 정수 팝: ");
        for (int i = 0; i < 50; i++) {
            if(iq.isEmpty())System.out.print(iq.Dequeue() + " ");
            else {
                System.out.println("\n큐가 비있습니다.");
                break;
            }
        }
    }
}
