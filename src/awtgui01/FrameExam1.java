package awtgui01;

import java.awt.Frame;

public class FrameExam1 {

    public static void main(String[] args) {
        Frame f=new Frame();
        f.setTitle("한글제목"); //프레임 제목
        f.setLocation(500, 200); //모니터 안에서 프레임의 위치
        f.setSize(350, 100); //프레임 크기
        f.setVisible(true); //화면에 보이게할지

    }

}