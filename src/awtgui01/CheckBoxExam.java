package awtgui01;

import java.awt.*;

public class CheckBoxExam extends Frame {

    public CheckBoxExam() {
        super(" 체크박스형");
        Panel p = new Panel();  // Panel 객체 생성

        Checkbox ck1 = new Checkbox("사과");  // 체크박스 객체 생성
        Checkbox ck2 = new Checkbox("딸기", true);    // 선택된 체크박스 객체 생성
        Checkbox ck3 = new Checkbox("키위");

        p.add(ck1);
        p.add(ck2);
        p.add(ck3);
        add(p);
        setLocation(400, 100);
        setVisible(true);
    }

    public static void main(String[] args) {
        new CheckBoxExam();    // 익명의 객체 생성
        // PanelExam p = new PanelExam();
    }

}
