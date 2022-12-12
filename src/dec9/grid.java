package dec9;
import java.awt.GridLayout;
import javax.swing.*;
public class grid extends JFrame{
        JButton btn1 = new JButton("1");
        JButton btn2 = new JButton("2");
        JButton btn3 = new JButton("3");
        JButton btn4 = new JButton("4");
        public grid(){
            setLayout(new GridLayout(2,2));
            add(btn1);
            add(btn2);
            add(btn3);
            add(btn4);
            setSize(600,600);
            setVisible(true);
            setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        }
}
