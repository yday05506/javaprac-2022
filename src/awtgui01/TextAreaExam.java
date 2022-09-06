package awtgui01;

import java.awt.*;

public class TextAreaExam extends Frame {

    public TextAreaExam() {
        super("텍스트필드");
        Panel p = new Panel();  // Panel 객체 생성

        TextArea ta1 = new TextArea("first", 3, 30);
        TextArea ta2 = new TextArea("second", 6, 10, TextArea.SCROLLBARS_NONE);

        p.add(ta1);
        p.add(ta2);
        add(p);
        setLocation(500, 150);
        setVisible(true);
    }

    public static void main(String[] args) {
        new TextAreaExam();    // 익명의 객체 생성
        // PanelExam p = new PanelExam();
    }

}
