package awtgui01;

import java.awt.*;

public class LabelExam extends Frame {

    public LabelExam() {
        super("Label");
        Panel p = new Panel();  // Panel 객체 생성

        Label label1 = new Label("레이블1");
        Label label2 = new Label("레이블2", Label.CENTER);

        label1.setBackground(Color.yellow);
        label2.setBackground(Color.green);

        p.add(label1);
        p.add(label2);
        add(p);
        setLocation(300, 100);
        setVisible(true);
    }

    public static void main(String[] args) {
        new LabelExam();    // 익명의 객체 생성
        // PanelExam p = new PanelExam();
    }

}
