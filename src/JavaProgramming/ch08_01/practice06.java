package ch08_01;

class Person {
    String name;
    private String mobile;
    private String office;
    private String email;

    public Person (String name, String mobile, String office, String email) {
        this.name = name;
        this.mobile = mobile;
        this.office = office;
        this.email = email;
    }
    void setName(String name) {
        this.name = name;
    }
    String getName() {
        return name;
    }

    void setMobile(String mobile) {
        this.mobile = mobile;
    }
    String getMobile() {
        return mobile;
    }

    void setOffice(String office) {
        this.office = office;
    }
    String getOffice() {
        return office;
    }

    void setEmail(String email) {
        this.email = email;
    }
    String getEmail() {
        return email;
    }

    public String toString() {
        return "Person [name: " + name + " mobile: " + mobile
                + ", office: " + office + ", email: " + email + "]";
    }


}
public class practice06 {
    public static void main(String[] args) {
        Person obj = new Person("YYUN", "01089202360",
                "03189202360", "chldbsrud010@naver.com");
        System.out.println(obj);
        System.out.println("name: " + obj.getName() + " mobile: " + obj.getMobile()
                + ", office: " + obj.getOffice() + ", email: " + obj.getEmail());

        obj.setName("Han seongyun");
        obj.setMobile("01088350296");
        obj.setOffice("03188350296");
        obj.setEmail("seongyun45@naver.com");
        System.out.println(obj);

        Person obj2 = obj;
        System.out.println(obj2);

        /*
        System.out.println();
        obj.setName("Yun sojung");
        obj.setMobile("01036207566");
        obj.setOffice("03136207566");
        obj.setEmail("wndufl9970@naver.com");

        Person obj3 = obj;
        System.out.println(obj3);
        */
    }
}
