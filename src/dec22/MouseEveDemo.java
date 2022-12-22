package dec22;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class MouseEveDemo extends JFrame implements MouseListener {
    JLabel lb = new JLabel("Hello ");
    JTextField txt = new JTextField(20);
    public MouseEveDemo(){
        setLayout(new FlowLayout(FlowLayout.CENTER));
        add(lb);
        txt.setBounds(50,50,100,100);
        add(txt);
        addMouseListener(this);
        setSize(400,400);
        setVisible(true);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }
    @Override
    public void mouseClicked(MouseEvent e) {
        System.out.println("Mouse clicked");
    }

    @Override
    public void mousePressed(MouseEvent e) {
        System.out.println("Mouse Pressed");
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        System.out.println("Mouse released");
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        System.out.println("Mouse entered");
    }

    @Override
    public void mouseExited(MouseEvent e) {
        System.out.println("Mouse exited");
    }
}
