package MidTermPractice;

public class ch0404 {
    public static void main(String[] args) {
        for (int i=1; i<=50; i++) {
            if(i/10 == 3) System.out.print("짝 ");
            else if(i%10 == 3 || i%10 == 6 || i%10 == 9) System.out.print("짝 ");
            else System.out.print(i + " ");
        }
    }
}
