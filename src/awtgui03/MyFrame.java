package awtgui03;

import javax.swing.*;

public class MyFrame extends JFrame {
    public MyFrame() {
        setTitle("300*300 스윙 프레임 만들기");
        setSize(300, 300);
        setVisible(true);
    }

    public static void main(String[] args) {
        MyFrame frame = new MyFrame();
    }
}
