package MidTermPractice;

public class ch0505 {
    public static void main(String[] args) {
        for (int a=1 ; a<101; a++ ) {
            for(int b=1; b<101; b++) {
                for(int c=1; c<101; c++){
                    if (a*a + b*b == c*c) System.out.println("{ " + a + ", " + b + ", " + c + " }");
                }
            }
        }
    }
}
