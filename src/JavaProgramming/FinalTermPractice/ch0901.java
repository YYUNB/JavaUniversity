package JavaProgramming.FinalTermPractice;

public class ch0901 {
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        System.out.println("두 수 중 큰 값은 (" + a + "," + b +
                ") : " + max(a, b));
    }

    public static int max(int num1, int num2) {
        return Math.max(num1, num2);
    }
}
