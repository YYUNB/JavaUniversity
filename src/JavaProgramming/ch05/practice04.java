package ch05;

public class practice04 {
    public static void main(String[] args) {
        System.out.print("2부터 100 사이 모든 소수 : ");
        for (int i=2; i<=100; i++) {
            int cnt=0;
            for (int j=1; j<=100; j++) if(i%j==0) cnt++;
            if (cnt==2) System.out.print(i + " ");
        }
    }
}
