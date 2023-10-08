package ch09;

public class practice01 {
    public static void main(String[] args) {
        int num1 = Integer.parseInt(args[0]);
        int num2 = Integer.parseInt(args[1]);
        int max = max(num1, num2);
        System.out.println("두 수 중 큰 값은 (" + num1 + ", " + num2 + ") : " + max);
    }

    public static int max(int num1, int num2) {
        if (num1 > num2) return num1;
        else return num2;
    }
}
