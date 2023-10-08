package JavaProgramming.ch14;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class practice06 extends JFrame {
    Random r = new Random();
    public practice06() {
        setSize(300, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        setTitle("Random Labels");

        Container c = getContentPane();
        c.setLayout(null);

        for (int i = 0; i < 20; i++) {
            int x = r.nextInt(250);
            int y = r.nextInt(250);

            JLabel label = new JLabel(" ");
            label.setOpaque(true);
            label.setBackground(Color.blue);
            label.setSize(10, 10);
            label.setLocation(50+x, 50+y);
            c.add(label);

            label.repaint();
        }
    }
    public static void main(String[] args) {
        new practice06();
    }
}
