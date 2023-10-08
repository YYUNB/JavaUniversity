package MidTermPractice;
import java.util.Scanner;
public class ch0506 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("출력할 숫자 개수: ");
        int n = sc.nextInt();
        int ppn = 0, pn = 1, c;
        System.out.print(ppn + " " + pn + " ");
        for(int i=0; i<n-2; i++) {
            c = ppn + pn;
            ppn = pn;
            pn = c;
            System.out.print(c + " ");
        }
    }
}
