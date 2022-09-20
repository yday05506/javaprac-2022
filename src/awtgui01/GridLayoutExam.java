package awtgui01;

import java.awt.*;

public class GridLayoutExam extends Frame {

    public GridLayoutExam() {
        super("FlowLayout");
        setLayout(new GridLayout(2, 3));    // 2행 3열 형태

        Button b1 = new Button("버튼 1");
        Button b2 = new Button("버튼 2");
        Button b3 = new Button("버튼 3");
        Button b4 = new Button("버튼 4");
        Button b5 = new Button("버튼 5");
        Button b6 = new Button("버튼 6");

        add(b1);
        add(b2);
        add(b3);
        add(b4);
        add(b5);
        add(b6);
        setSize(150, 150);
        setVisible(true);
    }

    public static void main(String[] args) {
        new GridLayoutExam();    // 익명의 객체 생성
        // PanelExam p = new PanelExam();
    }
}
