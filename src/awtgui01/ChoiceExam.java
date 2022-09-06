package awtgui01;

import java.awt.*;

public class ChoiceExam extends Frame {

    public ChoiceExam() {
        super("Choice 테스트");
        Panel p = new Panel();  // Panel 객체 생성
        Choice ch = new Choice();

        ch.addItem("봄");    // 항목 데이터 추가
        ch.addItem("여름");
        ch.addItem("가을");
        ch.addItem("겨울");

        p.add(ch);
        add(p);
        setLocation(300, 150);
        setVisible(true);
    }

    public static void main(String[] args) {
        new ChoiceExam();    // 익명의 객체 생성
        // PanelExam p = new PanelExam();
    }

}
