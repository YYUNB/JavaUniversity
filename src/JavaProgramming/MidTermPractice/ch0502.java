package MidTermPractice;
import java.util.Scanner;
public class ch0502 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("M: ");
        int m = sc.nextInt();
        int r = 0;
        for(int i=1; i<=m; i++) {
            r += i*i+1;
        }
        System.out.println("R= " + r);
    }
}
