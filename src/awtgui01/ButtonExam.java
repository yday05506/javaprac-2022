package awtgui01;

import java.awt.*;

public class ButtonExam extends Frame {

    public ButtonExam() {
        super("버튼");
        Panel p = new Panel();  // Panel 객체 생성

        Button b1 = new Button();   // 버튼 b1 객체 생성
        Button b2 = new Button("버튼 2"); // 버튼 b2 객체 생성 하고 이름(Label)을 "버튼 2"
        b1.setLabel("버튼 1");    // 버튼 b1 객체에 이름(Label) 설정

        p.add(b1);
        p.add(b2);
        add(p);
        setLocation(200, 200);
        setSize(250, 100);
        setVisible(true);
    }

    public static void main(String[] args) {
        new ButtonExam();    // 익명의 객체 생성
        // PanelExam p = new PanelExam();
    }

}
