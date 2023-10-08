package MidTermPractice;
import java.util.Scanner;

class Student {
    String name;
    private String rollno;
    int age;

    Student(String name, String rollno, int age) {
        this.name = name;
        this.rollno = rollno;
        this.age = age;
    }

    public String toString() {
        return "Student [name: " + name + ", rollno: " + rollno + ", age: " + age + "]";
    }

}
public class ch0805 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("학생의 이름: ");
        String name = sc.next();
        System.out.print("학생의 학번: ");
        String rollno = sc.next();
        System.out.print("학생의 나이: ");
        int age = sc.nextInt();

        Student student = new Student(name, rollno, age);
        System.out.println(student);
    }
}
