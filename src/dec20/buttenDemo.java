package dec20;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class buttenDemo extends JFrame implements ItemListener {
    JLabel lb = new JLabel("Select your course:");
    JRadioButton btn1 = new JRadioButton("Bsc.CSIT",true);
    JRadioButton btn2 = new JRadioButton("BIM");
    JRadioButton btn3 = new JRadioButton("BCA");
    JRadioButton btn4 = new JRadioButton("BIT");
    ButtonGroup bg = new ButtonGroup();
    String [] course = {"Bsc.CSIT","BIM","BCA","BIT"};
    JComboBox comboBox = new JComboBox(course);
    JLabel lb1 = new JLabel("Second choice");
    JLabel lb2 = new JLabel("select another");

    public buttenDemo(){
        setLayout(new FlowLayout(FlowLayout.CENTER));
        add(lb);
        add(btn1);
        add(btn2);
        add(btn3);
        add(btn4);
        bg.add(btn1);
        bg.add(btn2);
        bg.add(btn3);
        bg.add(btn4);
        add(lb1);
        add(comboBox);
        comboBox.addItemListener(this);
        add(lb2);
        setVisible(true);
        setSize(600,600);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        lb2.setText("Your second choice is : "+comboBox.getSelectedItem());
    }
}
