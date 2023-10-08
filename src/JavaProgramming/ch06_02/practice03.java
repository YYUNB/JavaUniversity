package ch06_02;

public class practice03 {
    public static void main(String[] args) {
        int[][] arr = new int[3][5]; // 생성과 동시에 초기화

        while(true) {
            int cnt = 0;
            for (int i=0; i<arr.length; i++) {
                for (int j=0; j<arr[i].length; j++) {
                    arr[i][j] = (int)(Math.random()*2);
                    if (arr[i][j] == 1) cnt++;
                }
            }
            if (cnt==5) break;
        }
        for (int i=0; i<arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println("");
        }
    }
}
