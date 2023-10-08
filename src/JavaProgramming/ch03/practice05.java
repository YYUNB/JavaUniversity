package ch03;

import java.util.Scanner;

public class practice05 {
    public static void main(String[] args) {
        Scanner std = new Scanner(System.in);
        System.out.print("받은 돈: ");
        int input = std.nextInt();
        System.out.print("상품 가격: ");
        int price = std.nextInt();
        double vat;
        vat = price * 0.1;
        System.out.println("부가세: " + (int)vat);
        System.out.println("잔돈: " + (input-price));
    }
}
