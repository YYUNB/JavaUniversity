package JavaProgramming.FinalTermPractice;

class Max {
    public int test(int a, int b) {
        return Math.max(a, b);
    }

    public double test(double a, double b) {
        return Math.max(a, b);
    }
}
public class ch0902 {
    public static void main(String[] args) {
        Max mt = new Max();
        int r = mt.test(4, 6);
        double r1 = mt.test(4.2, 6.1);
        System.out.println("두 정수 중 큰 값은 " + r);
        System.out.println("두 실수 중 큰 값은 " + r1);
    }
}
