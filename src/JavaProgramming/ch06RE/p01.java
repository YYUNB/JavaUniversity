package ch06RE;

public class p01 {
    public static void main(String[] args) {
        double[] arr = {1.0, 2.0, 3.0, 4.0};
        double sum = 0.0, max = 0.0;
        for (double i : arr) {
            System.out.print(i + " ");
            sum += i;
            if (max < i) max = i;
        }
        System.out.println("\n합은 " + sum);
        System.out.println("최대값은 " + max);

    }
}
