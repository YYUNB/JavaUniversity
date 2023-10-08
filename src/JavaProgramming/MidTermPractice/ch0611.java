package MidTermPractice;

public class ch0611 {
    public static void main(String[] args) {
        int[][] arr = new int[3][4];
        int sum = 0;
        for (int i=0; i<3; i++) {
            for (int j=0; j<4; j++) {
                arr[i][j] = (int)(Math.random()*10);
                sum += arr[i][j];
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("합은 " + sum);
    }
}
