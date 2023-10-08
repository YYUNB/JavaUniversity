package MidTermPractice;
import java.util.Scanner;
public class ch0402 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("요일을 입력하세요: ");
        String day = sc.next();
        switch(day) {
            case "MON": case "TUE": case "WED": case "THU": case "FRI":
                System.out.println("주중");
                break;
            case "SAT": case "SUN":
                System.out.println("주말");
                break;
        }
    }
}
