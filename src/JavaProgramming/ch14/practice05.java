package JavaProgramming.ch14;

import javax.swing.*;
import java.awt.*;

public class practice05 extends JFrame {
    public practice05() {
        setSize(600, 500);
        setTitle("Panel Test");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c = getContentPane();
        c.setLayout(null);

        JPanel pt = new JPanel(null);
        pt.setBounds(0, 0, 600, 250);

        JPanel pt1 = new JPanel(new BorderLayout());
        pt1.setBounds(0, 0,200, 250);
        JCheckBox redBtn = new JCheckBox("Red", true);
        JCheckBox greenBtn = new JCheckBox("Green", false);
        JCheckBox blueBtn = new JCheckBox("Blue", false);

        c.add(pt);
        pt.add(pt1);

        pt1.add(redBtn, BorderLayout.NORTH);
        pt1.add(greenBtn, BorderLayout.CENTER);
        pt1.add(blueBtn, BorderLayout.SOUTH);

        JPanel pt2 = new JPanel(new BorderLayout());
        pt2.setBounds(200, 0,200, 250);
        JRadioButton aBtn = new JRadioButton("Red", true);
        JRadioButton bBtn = new JRadioButton("Green", false);
        JRadioButton oBtn = new JRadioButton("Blue", false);

        pt.add(pt2);
        pt2.add(aBtn, BorderLayout.NORTH);
        pt2.add(bBtn, BorderLayout.CENTER);
        pt2.add(oBtn, BorderLayout.SOUTH);

        JPanel pt3 = new JPanel();
        pt3.setBounds(400, 0, 200, 250);
        JButton chooseBtn = new JButton("선택");
        JButton cancelBtn = new JButton("취소");

        pt.add(pt3);
        pt3.add(chooseBtn);
        pt3.add(cancelBtn);

        JPanel pb = new JPanel(null);
        pb.setBounds(0, 300, 600, 250);

        c.add(pb);

        JPanel pb1 = new JPanel(null);
        pb1.setBounds(0, 0, 400, 250);
        JTextArea textArea = new JTextArea("자료입력공간");
        textArea.setBounds(0, 0, 300, 150);

        pb.add(pb1);
        pb1.add(textArea);

        JPanel pb2 = new JPanel(null);
        pb2.setBounds(400, 0, 200, 250);
        JComboBox comboBox = new JComboBox();
        comboBox.setBounds(0, 0, 100, 30);
        comboBox.addItem("1구간 지역");
        comboBox.addItem("2구간 지역");

        pb.add(pb2);
        pb2.add(comboBox);

        setVisible(true);
    }
    public static void main(String[] args) {
        new practice05();
    }
}
