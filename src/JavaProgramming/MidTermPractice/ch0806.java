package MidTermPractice;

class Person {
    String name;
    private String mobile;
    private String office;
    private String email;

    Person(String n, String m, String o, String e) {
        this.name = n;
        this.mobile = m;
        this.office = o;
        this.email = e;
    }

    void setName(String n) {
        this.name = n;
    }
    String getName() {
        return name;
    }

    void setMobile(String m) {
        this.mobile = m;
    }
    String getMobile() {
        return mobile;
    }

    void setOffice (String o) {
        this.office = o;
    }
    String getOffice () {
        return office;
    }

    void setEmail(String e) {
        this.email = e;
    }
    String getEmail() {
        return email;
    }


    public String toString() {
        return "Person [name: " + name + ", mobile: " + mobile + ", office: "
                + office + "]";
    }
}
public class ch0806 {
    public static void main(String[] args) {
        Person obj = new Person("Kim", "01012345678", "0311234567"
                , "abc@example.net");
        System.out.println(obj);
        System.out.println("name: " + obj.getName() + ", mobile: " + obj.getMobile()
                + ", office: " + obj.getOffice() + ", email: " + obj.getEmail());

        obj.setName("Park");
        obj.setMobile("01087654321");
        obj.setOffice("0411234567");
        obj.setEmail("cba@example.ac.kr");
        System.out.println(obj);

        Person obj2 = obj;
        System.out.println(obj2);
    }
}
