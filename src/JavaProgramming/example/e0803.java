package example;

class Initial {
    int number;
    double rate;
    String name;
    int[] score;
    //Box1 box = new Box1();
    public void aMethod() {
        int cnt;
        System.out.println(number);
    }
}

public class e0803 {
    public static void main(String args[]) {
        int var1;
        double var2;
        Initial ob1 = new Initial();

        System.out.println("객체 변수 number의 값은 : " + ob1.number);
        System.out.println("객체 변수 rate의 값은: " + ob1.rate);
        System.out.println("객체 변수 name의 값은: " + ob1.name);
        System.out.println("객체 변수 score의 값은: " + ob1.score);
        //System.out.println("객체 변수 score의 값은 " + ob1.box);
        ob1.aMethod();
    }
}
