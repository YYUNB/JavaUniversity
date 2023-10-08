package ch08_01;

public class practice03 {
    static int i, j, k = 1;
    public static void main(String[] args) {
        int i = 2;
        int j = 3;
        {
            int k = 4;
            System.out.println("i와 j의 합은 : " + (i + j));
            System.out.println("클래스 변수 i와 j의 합은: " + (practice03.i + practice03.j));
        }
        k = i + k;
        System.out.println("k는 : " + k);
        System.out.println("i는 : " + i);
        System.out.println("j는 : " + j);
        System.out.println("클래스변수 i : " + practice03.i);
    }
}
