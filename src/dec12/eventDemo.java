package dec12;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class eventDemo implements ActionListener {
    JFrame j = new JFrame("hello");
    JButton btn = new JButton("Click");
    JLabel lb = new JLabel("");

    public void eventDemo(){
        j.setLayout(null);

        btn.setBounds(10,20,50,40);
        lb.setBounds(10,30,120,20);

        btn.addActionListener(this);

        j.setSize(600,600);
        j.add(btn);
        j.add(lb);

        j.setVisible(true);
        j.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }

    @Override
    public void actionPerformed(ActionEvent o){
        lb.setText("Welcome home");
    }
}
