package dec12;

import javax.swing.*;
import java.awt.*;

public class borderLyout extends JFrame{
    JButton btn1 = new JButton("EAST");
    JButton btn2 = new JButton("WEST");
    JButton btn3 = new JButton("NORTH");
    JButton btn4 = new JButton("SOUTH");
    JButton btn5 = new JButton("CENTER");
    public borderLyout(){
        setLayout(new BorderLayout());
        add(btn1,BorderLayout.EAST);
        add(btn2,BorderLayout.WEST);
        add(btn3,BorderLayout.NORTH);
        add(btn4,BorderLayout.SOUTH);
        add(btn5,BorderLayout.CENTER);
        setSize(600,600);
        setVisible(true);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }
}
