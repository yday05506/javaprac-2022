package awtgui03;

import javax.swing.*;
import java.awt.*;

public class ContentPaneEX extends JFrame {
    public ContentPaneEX() {
        setTitle("ContentPane 과 JFrame");
        // Frame 창의 x 버튼을 누르면 창이 닫히고, 프로그램 실행 종료
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // contentPane 객체 생성
        Container contentPane = getContentPane();
        // contentPane의 배경색
        contentPane.setBackground(Color.ORANGE);
        // contentPane에 들어갈 컴포넌트들의 정렬 방법 설정
        contentPane.setLayout(new FlowLayout());

        // contentPane에 버튼들을 부착
        contentPane.add(new JButton("OK"));
        contentPane.add(new JButton("Cancel"));
        contentPane.add(new JButton("Ignore"));

        setSize(300, 150);
        setVisible(true);
    }

    public static void main(String[] args) {
        new ContentPaneEX();
    }
}
