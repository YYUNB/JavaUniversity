package JavaProgramming.FinalTermPractice;

class Date {
    int year, month, day;

    public Date(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public String toString() {
        return year + "." + month + "." + day;
    }
}

class Employee {
    String name;
    Date birthday;

    public Employee(String name, Date birthday) {
        this.name = name;
        this.birthday = birthday;
    }

    public String toString() {
        return name + ": " + birthday;
    }
}
public class ch1003 {
    public static void main(String[] args) {
        Date d = new Date(2003, 1, 9);
        Employee e = new Employee("최윤경", d);
        System.out.println(d);
        System.out.println(e);
    }
}
