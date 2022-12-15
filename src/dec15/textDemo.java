package dec15;

import javax.swing.*;
import java.awt.*;

public class textDemo {
    JFrame ad = new JFrame("Text demo");
    JLabel lb1 = new JLabel("Username: ");
    JLabel lb2 = new JLabel("Password: ");
    JTextField txt1 = new JTextField("Username = ");
    JPasswordField pass = new JPasswordField("Password = ");
    JTextArea ar = new JTextArea("Code blocks...",10,100);
    JButton btn = new JButton("Save");
    JScrollPane txtar = new JScrollPane(ar);
    public textDemo(){
        ad.setLayout(new GridLayout(5,2));
        ad.add(lb1);
        ad.add(txt1);
        ad.add(lb2);
        ad.add(pass);
        ad.add(txtar);
        ad.add(btn);
        ad.setSize(400,400);
        ad.setVisible(true);
        ad.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }
}
