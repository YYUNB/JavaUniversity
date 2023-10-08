package ch04;

public class practice04 {
    public static void main(String[] args) {
        for(int i=1; i<=50; i++) {
            if (i%10 == 3 || i%10 == 6 || i%10 == 9) System.out.print("짝 ");
            else if (i%100 == 3 || i %100 == 6 || i%100 == 9) System.out.print(i+"짝 ");
            else System.out.print(i + " ");
            // 일의 자리는 처리되는데 십의 자리가 369인 경우 처리 못함 ㅠ
            // 나머지말고 나눗셈으로 하면 된대 수정하셈
        }
    }
}
