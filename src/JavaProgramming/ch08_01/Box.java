package ch08_01;

public class Box {
    // 속성 멤버 변수
    int width;
    int height;
    int depth;

    // 기능: 생성자 메소드
    public Box(int w, int h, int d) {
        width = w;
        height = h;
        depth = d;
    }

    // 기능: 메소드
    public void volume() {
        int vol;
        vol = width * height * depth;
        System.out.println("Volumn is " +vol);
    }
}
