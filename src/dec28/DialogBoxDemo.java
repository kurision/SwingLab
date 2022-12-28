package dec28;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DialogBoxDemo {
    JFrame j2 = new JFrame();
    JButton btn1 = new JButton("Model Dialog");
    JButton btn2 = new JButton("Modelless Dialog");
    JDialog d1 = new JDialog(j2,"Dialog box 1");
    JButton btn3 = new JButton("OK!");
    ActionListener a1 = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            if(e.getSource().equals(btn1)){

                d1.setVisible(true);
            };
        }
    };
    public DialogBoxDemo(){
        d1.add(btn3);
        d1.setSize(200,200);
        d1.setLayout(new FlowLayout(FlowLayout.LEFT));
        j2.setTitle("Dialog box demo");
        j2.setLayout(new FlowLayout(FlowLayout.CENTER));
        j2.add(btn1);
        j2.add(btn2);
        btn1.addActionListener(a1);
        j2.setSize(400,300);
        j2.setVisible(true);
        j2.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }
}
