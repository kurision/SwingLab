package dec28;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class PopupMenuDemo extends MouseAdapter{
    JFrame j1 = new JFrame();
    JPopupMenu Pop = new JPopupMenu("");
    JMenuItem i1 = new JMenuItem("Copy");
    JMenuItem i2 = new JMenuItem("Paste");
    JMenuItem i3 = new JMenuItem("Refresh");
    public PopupMenuDemo(){
        j1.setTitle("Pop up menu Demo");
        j1.setLayout(new FlowLayout(FlowLayout.CENTER));
        Pop.add(i1);
        Pop.add(i2);
        Pop.add(i3);
        j1.addMouseListener(new Handler());


        j1.setSize(400,300);
        j1.setVisible(true);
        j1.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }
    class Handler extends MouseAdapter{
        @Override
        public void mouseClicked(MouseEvent e){
            if(e.getButton()==MouseEvent.BUTTON3){
                Pop.show(j1,e.getX(),e.getY());
            }
        }
    }
}
