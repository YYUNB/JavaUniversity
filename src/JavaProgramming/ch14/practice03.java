package JavaProgramming.ch14;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class practice03 extends JFrame {
    public practice03() {
        Container ct = getContentPane();
        ct.setLayout(new FlowLayout());

        JLabel label = new JLabel();
        for (int i = 1; i <= 4; i++) {
            String str = i + "학년";
            JButton btn = new JButton(str);
            ct.add(btn);
            btn.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    label.setText(str);
                }
            });
        }
        add(label);
        setTitle("Event Test1");
        setSize(300, 200);
        setVisible(true);
    }

    public static void main(String[] args) {
        new practice03();
    }
}
