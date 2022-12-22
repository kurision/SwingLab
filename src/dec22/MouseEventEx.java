package dec22;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

public class MouseEventEx extends MouseMotionAdapter {
    JFrame f = new JFrame("Mouse event Demo");
    public MouseEventEx(){
        f.setLayout(new FlowLayout(FlowLayout.CENTER));
        //f.addMouseListener(this);
        f.addMouseMotionListener(this);
        f.setSize(400,300);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }
//    @Override
//    public void mouseClicked(MouseEvent e){
//        System.out.println("Mouse is clicked");
//        Graphics g = f.getGraphics();
//        g.setColor(Color.lightGray);
//        g.fillOval(e.getX(),e.getY(),10,20);
//    }
    @Override
    public void mouseDragged(MouseEvent e){
        System.out.println("Mouse is dragged");
        Graphics g = f.getGraphics();
        g.setColor(Color.BLACK);
        g.fillOval(e.getX(),e.getY(),10,20);
    }
}
