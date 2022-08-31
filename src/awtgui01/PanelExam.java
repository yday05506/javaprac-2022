package awtgui01;

import java.awt.*;

public class PanelExam  extends Frame {

    public PanelExam() {
        super("Panel");
        Panel p = new Panel();  // Panel 객체 생성
        p.setBackground(Color.BLUE);    // panel의 배경을 파랑으로 설정
        add(p); // 현재 Frame에 Panel을 붙임
        setSize(300, 80);
        setVisible(true);
    }

    public static void main(String[] args) {
        new PanelExam();    // 익명의 객체 생성
        // PanelExam p = new PanelExam();
    }

}
