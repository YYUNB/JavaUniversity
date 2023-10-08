package ch06_01;

public class practice01 {
    public static void main(String[] args) {
        double[] arr = {1.0, 2.0, 3.0, 4.0};
        for (double i : arr) System.out.print(i + " ");
        double sum = 0;
        for(double i : arr) sum += i;
        System.out.println("\n합은 " + sum);
        double max = 0;
        for (double i : arr) if (max < i) max = i;
        System.out.println("최대값은 " + max);
    }
}
