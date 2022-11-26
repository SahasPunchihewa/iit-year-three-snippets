package week9.tute;

import javax.swing.*;
import java.awt.*;

public class MyCalculator extends JFrame
{
    public MyCalculator()
    {
        JFrame frame = new JFrame();
        JTextField input = new JTextField(100);

        frame.setSize(500, 300);
        frame.setLayout(new BorderLayout());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setBackground(Color.blue);

        JPanel bottomPanel = new JPanel();
        JPanel leftPanel = new JPanel();
        JPanel rightPanel = new JPanel();

        bottomPanel.setBackground(Color.blue);
        leftPanel.setBackground(Color.blue);
        rightPanel.setBackground(Color.blue);

        bottomPanel.setLayout(new GridLayout(1, 2));
        leftPanel.setLayout(new GridLayout(4, 3));
        rightPanel.setLayout(new GridLayout(4, 1));

        JButton b1 = new JButton("1");
        JButton b2 = new JButton("2");
        JButton b3 = new JButton("3");
        JButton b4 = new JButton("4");
        JButton b5 = new JButton("5");
        JButton b6 = new JButton("6");
        JButton b7 = new JButton("7");
        JButton b8 = new JButton("8");
        JButton b9 = new JButton("9");
        JButton b0 = new JButton("0");
        JButton bDash = new JButton("-");
        JButton bPlus = new JButton("+");
        JButton bMinus = new JButton("-");
        JButton bClear = new JButton("Clear");

        b1.setBackground(Color.red);
        b2.setBackground(Color.red);
        b3.setBackground(Color.red);
        b4.setBackground(Color.red);
        b5.setBackground(Color.red);
        b6.setBackground(Color.red);
        b7.setBackground(Color.red);
        b8.setBackground(Color.red);
        b9.setBackground(Color.red);
        b0.setBackground(Color.red);
        bDash.setBackground(Color.red);
        bPlus.setBackground(Color.green);
        bMinus.setBackground(Color.green);
        bClear.setBackground(Color.green);

        //b1.setOpaque(true);
        b2.setOpaque(true);
        b3.setOpaque(true);
        b4.setOpaque(true);
        b5.setOpaque(true);
        b6.setOpaque(true);
        b7.setOpaque(true);
        b8.setOpaque(true);
        b9.setOpaque(true);
        b0.setOpaque(true);
        bDash.setOpaque(true);
        bPlus.setOpaque(true);
        bMinus.setOpaque(true);
        bClear.setOpaque(true);

        //b1.setBorder(null);
                b2.setBorder(this.rootPane.getBorder());
                b3.setBorder(null);
                b4.setBorder(null);
                b5.setBorder(null);
                b6.setBorder(null);
                b7.setBorder(null);
                b8.setBorder(null);
                b9.setBorder(null);
                b0.setBorder(null);
                bDash.setBorder(null);
                bPlus.setBorder(null);
                bMinus.setBorder(null);
                bClear.setBorder(null);

        leftPanel.add(b1);
        leftPanel.add(b2);
        leftPanel.add(b3);
        leftPanel.add(b4);
        leftPanel.add(b5);
        leftPanel.add(b6);
        leftPanel.add(b7);
        leftPanel.add(b8);
        leftPanel.add(b9);
        leftPanel.add(b0);
        leftPanel.add(bDash);


        rightPanel.add(bPlus);
        rightPanel.add(bMinus);
        rightPanel.add(bClear);

        bottomPanel.add(leftPanel);
        bottomPanel.add(rightPanel);
        frame.add(input);
        frame.add(bottomPanel);

        frame.setVisible(true);
    }
}
