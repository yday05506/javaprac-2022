package awtgui03;

import javax.swing.*;
import java.awt.*;

public class GridLayoutEx extends JFrame {
    public GridLayoutEx() {
        setTitle("GridLayout Sample");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c = getContentPane();
        GridLayout grid = new GridLayout(4, 2);
        grid.setVgap(5);

        c.setLayout(grid);
        c.add(new JLabel("이름"));
        c.add(new JTextField(""));

        c.add(new JLabel("학번"));
        c.add(new JTextField(""));

        c.add(new JLabel("학과"));
        c.add(new JTextField(""));

        c.add(new JLabel("과목"));
        c.add(new JTextField(""));

        c.setLayout(new BorderLayout(30, 40));
        c.add(new JButton("add"), BorderLayout.NORTH);
        c.add(new JButton("sub"), BorderLayout.SOUTH);
        c.add(new JButton("muliply"), BorderLayout.EAST);
        c.add(new JButton("divide"), BorderLayout.WEST);
        c.add(new JButton("Calculate"), BorderLayout.CENTER);

        setSize(300, 200);
        setVisible(true);
    }

    public static void main(String[] args) {
        new GridLayoutEx();
    }
}
