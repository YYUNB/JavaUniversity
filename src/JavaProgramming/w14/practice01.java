package JavaProgramming.w14;

import java.util.Scanner;

public class practice01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = sc.next();
        int zero = 0, one = 0;

        for (int i = 0; i < n.length()-1 ; i++) {
            if(n.charAt(i) == '0' && n.charAt(i) != n.charAt(i+1) ) zero++;
            else if (n.charAt(i) == '1' && n.charAt(i) != n.charAt(i+1)) one++;
        }

        if(n.charAt(n.length()-1) == '0') zero++;
        else one++;

        System.out.println("result: " + Math.min(zero, one));
    }
}
