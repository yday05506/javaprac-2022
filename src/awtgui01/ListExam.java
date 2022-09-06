package awtgui01;

import java.awt.*;

public class ListExam extends Frame {

    public ListExam() {
        super("리스트");
        Panel p = new Panel();  // Panel 객체 생성
        List list1 = new List(4, true); // 4개의 항목을 보여줌. 다중선택 가능

        // 목록 데이터 입력
        list1.add("월");
        list1.add("화");
        list1.add("수");
        list1.add("목");
        list1.add("금");
        list1.add("토");
        list1.add("일");

        p.add(list1);
        add(p);
        setLocation(300, 150);
        setVisible(true);
    }

    public static void main(String[] args) {
        new ListExam();    // 익명의 객체 생성
        // PanelExam p = new PanelExam();
    }

}
