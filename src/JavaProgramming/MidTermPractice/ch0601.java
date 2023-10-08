package MidTermPractice;

public class ch0601 {
    public static void main(String[] args) {
        double[] arr = {1.0, 2.0, 3.0, 4.0};
        double sum = 0, max = 0;
        for(double i:arr) {
            sum += i;
            if (max < i) max = i;
            System.out.print(i + " ");
        }
        System.out.println("\n합은 " + sum);
        System.out.println("최댓값은 " + max);
    }
}
