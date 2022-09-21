package awtgui02;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class WindowEventExam2 extends Frame {
    public WindowEventExam2() {
        super("종료 버튼을 눌러주세요.");

        setSize(300, 100);
        setVisible(true);

        // 현재 프레임에 이벤트 핸들러(addWindowListener)를 연결
        addWindowListener(new MyClass());
    }

    public static void main(String[] args) {
        new WindowEventExam2();
    }
}

class MyClass extends WindowAdapter {
    // WindowAdapter를 상속 받아서 이벤트 핸들러에 연결하면
    // 구현하고자 하는 메소드만 오버라이딩 됨
    public void windowClosing(WindowEvent e) {
        System.exit(0); // 프레임 창의 x 버튼을 누르면 창이 닫히고 실행이 종료
    }
}
