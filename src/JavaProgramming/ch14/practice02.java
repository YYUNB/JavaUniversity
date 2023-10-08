package JavaProgramming.ch14;

import javax.swing.*;
import java.awt.*;

public class practice02 extends JFrame {

    public practice02() {
        Container ct = getContentPane();
        GridLayout g1 = new GridLayout(4, 3, 10, 10);
        ct.setLayout(g1);
        for (int i = 1; i <= 10; i++) ct.add(new JButton("레이아웃" + i));
        setTitle("GridLayout Test");
        setSize(400, 200);
        setVisible(true);
    }
    public static void main(String[] args) {
        new practice02();
    }
}
