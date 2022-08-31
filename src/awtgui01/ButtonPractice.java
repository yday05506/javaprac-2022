package awtgui01;

import java.awt.*;

public class ButtonPractice extends Frame {

    public ButtonPractice() {
        super("버튼");
        Panel p = new Panel();  // Panel 객체 생성

        Button b1 = new Button("확인");
        Button b2 = new Button("취소");
        Button b3 = new Button("삭제");

        p.add(b1);
        p.add(b2);
        p.add(b3);
        add(p);
        setLocation(200, 200);
        setSize(250, 100);
        setVisible(true);
    }

    public static void main(String[] args) {
        new ButtonPractice();    // 익명의 객체 생성
        // PanelExam p = new PanelExam();
    }

}
