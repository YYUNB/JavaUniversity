package MidTermPractice;

public class ch0609 {
    public static void main(String[] args) {
        int[][] a = {{1, 2, 3}, {1, 2}, {1}, {1, 2, 3}};
        for(int[] i: a) {
            for(int j: i) System.out.print(j + " ");
            System.out.println();
        }
    }
}
