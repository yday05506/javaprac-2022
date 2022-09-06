package awtgui01;

import java.awt.*;

public class FlowLayoutExam extends Frame {

    public FlowLayoutExam() {
        super("FlowLayout");
        setLayout(new FlowLayout());

        Button b1 = new Button("첫 번째");
        Button b2 = new Button("두 번째");
        Button b3 = new Button("세 번째");

        add(b1);
        add(b2);
        add(b3);
        setSize(500, 150);
        setVisible(true);
    }

    public static void main(String[] args) {
        new FlowLayoutExam();    // 익명의 객체 생성
        // PanelExam p = new PanelExam();
    }

}
