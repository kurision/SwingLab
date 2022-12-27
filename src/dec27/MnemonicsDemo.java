package dec27;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

public class MnemonicsDemo extends JFrame {
    JMenuBar m1= new JMenuBar();
    JMenu Faculties = new JMenu("Faculties");
    JMenu Genshin = new JMenu("Genshin");
    JMenuItem csit = new JMenuItem("CSIT");
    JMenuItem bca = new JMenuItem("BCA");
    JMenuItem manage = new JMenuItem("Management");
    JMenuItem i1= new JMenuItem("Eula");
    JMenuItem i2 = new JMenuItem("Kequing");
    JMenuItem i3 = new JMenuItem("Hutao");
    JMenuItem i4 = new JMenuItem("Raiden Shogun");

    KeyStroke ks = KeyStroke.getKeyStroke("ctrl C");
    String imgSrc = "D:\\SEVENTH\\JAVA\\GUI\\SwingLab\\assets\\images\\lisa.png ";
    Icon myIcon = new ImageIcon(imgSrc);
    JLabel test = new JLabel("");
    JLabel lb2 = new JLabel(myIcon);
    JMenuItem i5 = new JMenuItem("Hello",myIcon);

    ActionListener a1 = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            test.setText("Hello");
        }
    };
    public MnemonicsDemo(){
        setLayout(new FlowLayout(FlowLayout.CENTER));
        Genshin.setMnemonic(KeyEvent.VK_M);
        i4.setAccelerator(ks);
        i4.addActionListener(a1);
        m1.add(Faculties);
        add(test);
        add(lb2);

        Faculties.add(m1);
        Faculties.add(csit);
        Faculties.add(bca);
        Faculties.add(manage);
        Faculties.add(Genshin);
        Genshin.add(i1);
        Genshin.add(i2);
        Genshin.add(i3);
        Genshin.add(i4);
        Genshin.add(i5);
        setJMenuBar(m1);
        setSize(400,300);
        setVisible(true);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }
}
