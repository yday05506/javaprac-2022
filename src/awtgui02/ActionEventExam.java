package awtgui02;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ActionEventExam extends Frame implements ActionListener {
    Button b1 = new Button("버튼");
    Panel p = new Panel();

    public ActionEventExam() {
        super("ActionEvent");
        p.add(b1);
        add(p);
        setSize(300, 150);
        setVisible(true);
        // 이벤트 발생 객체(b1)에 이벤트 핸들러(ActionListener)를 연결
        b1.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if(ae.getSource() == b1) {
            System.exit(0);
        }
    }

    public static void main(String[] args) {
        new ActionEventExam();
    }
}
