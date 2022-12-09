package dec9;
import javax.swing.*;
import java.awt.FlowLayout;
public class flowLayout extends JFrame{
    JLabel lable1 = new JLabel("First Label");
    JLabel lable2 = new JLabel("Second label");
    JTextField textf1 = new JTextField(15);
    JTextField textf2 = new JTextField(15);
    JButton button = new JButton("Button Text");
    public flowLayout(){
        setTitle("My second Frame");
        setLayout(new FlowLayout(FlowLayout.CENTER));
        setLayout(null);
        lable1.setBounds(10,10,100,25);
        add(lable1);
        textf1.setBounds(120,10,100,17);
        add(textf1);
        lable2.setBounds(10,40,100,25);
        add(lable2);
        textf2.setBounds(120,40,100,17);
        add(textf2);
        add(button);
        setSize(600,600);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}
