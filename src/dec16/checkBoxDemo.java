package dec16;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class checkBoxDemo extends JFrame {
    JLabel lb1 = new JLabel("Food Ordering System");
    JCheckBox chk1 = new JCheckBox("Tea @20");
    JCheckBox chk2 = new JCheckBox("Momo @50");
    JCheckBox chk3 = new JCheckBox("Sandwitch @100");
    JCheckBox chk4 = new JCheckBox("Pizza @500000");
    JCheckBox chk5 = new JCheckBox("ChikenCurry @2000");
    JButton btn = new JButton("Submit");
    JLabel lb2 = new JLabel();
    public void CreateUI(){
        setLayout(new GridLayout(8,1,5,30));
        ActionListener ac = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                lb2.setText("My orders");
            }
        };
        add(lb1);
        add(chk1);
        add(chk2);
        add(chk3);
        add(chk4);
        add(chk5);
        add(btn);
        add(lb2);
        btn.addActionListener(ac);
        setSize(400,400);
        setVisible(true);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }
}
