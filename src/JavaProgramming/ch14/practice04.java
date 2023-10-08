package JavaProgramming.ch14;

import javax.swing.*;
import java.awt.*;

public class practice04 extends JFrame {
    public practice04() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(600, 300);
        setVisible(true);

        Container c = getContentPane();
        c.setLayout(new GridLayout(5, 5, 5, 5));
        String arr[][] = {{"Backspace", "", "", "CE", "C"},
                {"7", "8", "9", "/", "sqrt"},
                {"4", "5", "6", "x", "%"},
                {"1", "2", "3", "-", "1/x"},
                {"0", "+/-", ".", "+", "="}};

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5 ; j++) {
                JButton btn = new JButton(arr[i][j]);
                btn.setBackground(Color.yellow);
                if(j>=0 && j<=2) btn.setForeground(Color.blue);
                else btn.setForeground(Color.red);
                c.add(btn);
            }
        }

    }

    public static void main(String[] args) {
        new practice04();
    }
}
