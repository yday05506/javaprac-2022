package awtgui01;

import java.awt.*;

public class DialogExam extends Frame {

    public DialogExam() {
        super("Dialog");    // Frame 제목
        Dialog d = new Dialog(this, "다이얼로그");   // Dialog 제목 : "다이얼로그"
        setSize(300, 100);
        setVisible(true);
        d.setSize(200, 50); // Dialog 크기
        d.setVisible(true); // Dialog 출력
    }

    public static void main(String[] args) {
        new DialogExam();    // 익명의 객체 생성
    }

}
