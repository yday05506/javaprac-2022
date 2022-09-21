package awtgui02;

import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyEventExam extends Frame implements KeyListener {
    TextField jumin1 = new TextField(10);
    Label lb = new Label("-", Label.CENTER);
    TextField jumin2 = new TextField(10);
    Panel p = new Panel();

    public KeyEventExam() {
        super("KeyEvent");
        p.add(jumin1);
        p.add(lb);
        p.add(jumin2);
        add(p);

        setSize(300, 100);
        setVisible(true);

        jumin1.addKeyListener(this);
    }

    public static void main(String[] args) {
        new KeyEventExam();
    }

    @Override
    public void keyTyped(KeyEvent ke) {
        if(jumin1.getText().trim().length() == 6)
            jumin2.requestFocus();
    }

    @Override
    public void keyPressed(KeyEvent ke) {
        if(ke.getKeyCode() == ke.VK_LEFT)
            jumin2.setText("Left 눌림");
    }

    @Override
    public void keyReleased(KeyEvent ke) {}
}
