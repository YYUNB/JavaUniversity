package MidTermPractice;
import java.util.Scanner;
public class ch0606 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char arr[] = {'월', '화', '수', '목', '금', '토', '일'};

        while (true) {
            System.out.print("정수를 입력하세요: ");
            int num = sc.nextInt();
            if (num < 0) {
                System.out.println("프로그램 종료합니다...");
                break;
            }
            for(int i=0; i<7; i++) {
                if (num%7==0) {
                    System.out.println(arr[6]);
                    break;
                }
                else if(num%7==i) System.out.println(arr[i-1]);
            }
        }
    }
}
