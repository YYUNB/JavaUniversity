package ch08_01;
import java.util.Scanner;
class Student {
    String name;
    private int num;
    int age;

    public Student(String name, int num, int age) {
        this.name = name;
        this.num = num;
        this.age = age;
    }
    public String toString() {
        return "Student [name: " + name + ", rollno: " + num + ", age: " + age + "]";
    }
}
public class practice05 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("학생의 이름: ");
        String name = stdIn.next();
        System.out.print("학생의 학번: ");
        int num = stdIn.nextInt();
        System.out.print("학생의 나이: ");
        int age = stdIn.nextInt();

        Student st = new Student(name, num, age);
        System.out.println(st);
    }
}
