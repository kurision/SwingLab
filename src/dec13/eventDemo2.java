package dec13;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class eventDemo2  {
    JFrame j= new JFrame("help");
    JLabel lb1 = new JLabel("First number:");
    JLabel lb2 = new JLabel("Second number:");
    JLabel lb3 = new JLabel("Result:");
    JTextField txt1 = new JTextField();
    JTextField txt2 = new JTextField();
    JButton btn = new JButton("Add");
    JButton btn2 = new JButton("Sub");
    JButton btn3 = new JButton("Product");
    JButton btn4 = new JButton("Div");
    myHandler m = new myHandler();
    public eventDemo2(){
        j.setLayout(new GridLayout(4,4,10,10));
        j.setSize(400,300);
        btn.addActionListener(m);
        btn2.addActionListener(m);
        btn3.addActionListener(m);
        btn4.addActionListener(m);
        btn.setActionCommand("Sum");
        btn2.setActionCommand("Difference");
        btn3.setActionCommand("Product");
        btn4.setActionCommand("Division");
        j.add(lb1);
        j.add(txt1);
        j.add(lb2);
        j.add(txt2);
        j.add(btn);
        j.add(btn2);
        j.add(btn3);
        j.add(btn4);
        j.add(lb3);
        j.setVisible(true);
        j.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }
    public class myHandler implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            double num1 = Double.parseDouble(txt1.getText());
            double num2 = Double.parseDouble(txt2.getText());
            if(e.getActionCommand().equals("Sum")){
                double sum = num1+num2;
                lb3.setText("Result: Sum = "+sum);
            }else if(e.getActionCommand().equals("Product")){
                double s = num1*num2;
                lb3.setText("Result: Product = "+s);
            }else if(e.getActionCommand().equals("Difference")){
                double s = num1-num2;
                lb3.setText("Result: Difference = "+s);
            }else if(e.getActionCommand().equals("Division")){
                double s = num1/num2;
                lb3.setText("Result: Division = "+s);
            }
        }
    }
}
