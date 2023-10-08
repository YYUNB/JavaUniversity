package JavaProgramming.ch14;

import javax.swing.*;
import java.awt.*;

public class practice01 extends JFrame {

    public practice01() {
        Container ct = getContentPane();
        BorderLayout b1 = new BorderLayout(10, 10);
        ct.setLayout(b1);
        ct.add(new JButton("버튼 1"), BorderLayout.NORTH);
        ct.add(new JButton("버튼 2"), BorderLayout.CENTER);
        ct.add(new JButton("버튼 3"), BorderLayout.SOUTH);

        setTitle("BorderLayout Test");
        setSize(300, 150);
        setVisible(true);
    }
    public static void main(String[] args) {
        new practice01();
    }
}
