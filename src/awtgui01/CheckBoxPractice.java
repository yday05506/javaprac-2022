package awtgui01;

import java.awt.*;

public class CheckBoxPractice extends Frame {

    public CheckBoxPractice() {
        super(" 체크박스형");
        Panel p = new Panel();  // Panel 객체 생성

        Checkbox ck1 = new Checkbox("봄");
        Checkbox ck2 = new Checkbox("여름");
        Checkbox ck3 = new Checkbox("가을");
        Checkbox ck4 = new Checkbox("겨울", true);

        p.add(ck1);
        p.add(ck2);
        p.add(ck3);
        p.add(ck4);
        add(p);
        setLocation(400, 100);
        setVisible(true);
    }

    public static void main(String[] args) {
        new CheckBoxPractice();    // 익명의 객체 생성
        // PanelExam p = new PanelExam();
    }

}
