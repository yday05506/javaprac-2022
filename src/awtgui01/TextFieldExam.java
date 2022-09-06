package awtgui01;

import java.awt.*;

public class TextFieldExam extends Frame {

    public TextFieldExam() {
        super("텍스트필드");
        Panel p = new Panel();  // Panel 객체 생성
        TextField tf1 = new TextField("주민등록 앞자리");
        TextField tf2 = new TextField("15");

        tf1.selectAll();
        tf2.setEchoChar('*');

        p.add(tf1);
        p.add(tf2);
        add(p);
        setLocation(300, 150);
        setVisible(true);
    }

    public static void main(String[] args) {
        new TextFieldExam();    // 익명의 객체 생성
        // PanelExam p = new PanelExam();
    }

}
