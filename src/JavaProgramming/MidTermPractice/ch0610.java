package MidTermPractice;

public class ch0610 {
    public static void main(String[] args) {
        int[][] arr = new int[3][5];
        while (true) {
            int cnt = 0;
            for(int i=0; i<3; i++) {
                for(int j=0; j<5; j++) {
                    arr[i][j] = (int)(Math.random()+0.5);
                    if (arr[i][j] == 1) cnt++;
                }
            }
            if (cnt == 5) {
                for (int i=0; i<3; i++) {
                    for (int j=0; j<5; j++) System.out.print(arr[i][j] + " ");
                    System.out.println();
                }
                break;
            }
        }

    }
}
