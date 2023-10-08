package MidTermPractice;

public class ch0501 {
    public static void main(String[] args) {
        for (int i=1; i<=9; i+=3) {
            System.out.println(i + "단\t\t\t" + (i+1) + "단\t\t\t" + (i+2) + "단");
            for (int j=1; j<=9; j++) {
                System.out.println(i + "*" + j + "=" + i*j + "\t\t" +
                        (i+1) + "*" + j + "=" + ((i+1)*j) + "\t\t" +
                        (i+2) + "*" + j + "=" + ((i+2)*j) + "\t\t");
            }
            System.out.println();
        }
    }
}
