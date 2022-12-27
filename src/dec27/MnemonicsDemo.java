package dec27;

import javax.swing.*;
import java.awt.*;
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
    KeyStroke ks = KeyStroke.getKeyStroke("ctrl+c");

    public MnemonicsDemo(){
        setLayout(new FlowLayout(FlowLayout.CENTER));
        Faculties.setMnemonic(KeyEvent.VK_M);
        i4.setAccelerator(ks);
        m1.add(Faculties);
        Faculties.add(m1);
        Faculties.add(csit);
        Faculties.add(bca);
        Faculties.add(manage);
        Faculties.add(Genshin);
        Genshin.add(i1);
        Genshin.add(i2);
        Genshin.add(i3);
        Genshin.add(i4);
        setJMenuBar(m1);
        setSize(400,300);
        setVisible(true);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }
}
