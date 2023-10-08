package MidTermPractice;

public class ch0504 {
    public static void main(String[] args) {
        System.out.print("2부터 100 사이의 모든 소수: ");
        for(int i=1; i<101; i++) {
            int cnt = 0;
            for (int j=1; j<101; j++) if (i%j == 0) cnt++;
            if (cnt == 2) System.out.print(i + " ");
        }
    }
}
