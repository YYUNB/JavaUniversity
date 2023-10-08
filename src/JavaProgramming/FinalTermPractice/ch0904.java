package JavaProgramming.FinalTermPractice;

/* 이미 같은 파일에 Circle이 있음..
class Circle {
    int x, y, radius;

}
 */
public class ch0904 {
    public static void main(String[] args) {
        Circle1[] circles = new Circle1[3];
        for (int i = 0; i < 3; i++) {
            int x = (int)(Math.random()*100);
            int y = (int)(Math.random()*100);
            int radius = (int)(Math.random()*100);
            circles[i] = new Circle1(x, y, radius);
            System.out.println(circles[i]);
        }
    }
}
