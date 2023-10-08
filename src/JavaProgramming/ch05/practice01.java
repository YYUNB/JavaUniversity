package ch05;

public class practice01 {
    public static void main(String[] args) {
        for (int i=1; i<=9; i+=3) {
            System.out.println(i+"단\t\t"+(i+1)+ "단\t\t"+(i+2)+"단");
            for (int j=1; j<=9; j++) {
                System.out.println(i+"*"+j+"="+i*j+"\t"+
                        (i+1)+"*"+j+"="+((i+1)*j)+"\t"
                        +(i+2)+"*"+j+"="+((i+2)*j));

            }
        }
    }
}
