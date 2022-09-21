package awtgui02;

import java.awt.*;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class WindowEventExam extends Frame implements WindowListener {
    public WindowEventExam() {
        super("종료 버튼을 눌러주세요.");

        setSize(300, 100);
        setVisible(true);

        // 현재 프레임에 이벤트 핸들러(addWindowListener)를 연결
        addWindowListener(this);
    }

    @Override
    public void windowOpened(WindowEvent e) {}

    public void windowClosing(WindowEvent e) {
        System.exit(0); // 프레임 창의 x 버튼을 누르면 창이 닫히고 실행이 종료
    }

    @Override
    public void windowClosed(WindowEvent e) {}

    @Override
    public void windowIconified(WindowEvent e) {}

    @Override
    public void windowDeiconified(WindowEvent e) {}

    @Override
    public void windowActivated(WindowEvent e) {}

    @Override
    public void windowDeactivated(WindowEvent e) {}

    public static void main(String[] args) {
        new WindowEventExam();
    }
}
