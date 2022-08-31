package awtgui01;

import java.awt.*;

public class RadioCheckBoxExam extends Frame {

    public RadioCheckBoxExam() {
        super(" 라디오박스형");
        Panel p = new Panel();  // Panel 객체 생성

        CheckboxGroup g = new CheckboxGroup();  //체크박스를 그룹으로 묶음
        Checkbox ra1 = new Checkbox("여자", g, true);
        Checkbox ra2 = new Checkbox("남자", g, false);

        p.add(ra1);
        p.add(ra2);
        add(p);
        setLocation(400, 100);
        setVisible(true);
    }

    public static void main(String[] args) {
        new RadioCheckBoxExam();    // 익명의 객체 생성
        // PanelExam p = new PanelExam();
    }

}
