package dec21;

import javax.swing.*;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class WindowEventDemo extends JFrame implements WindowListener {
    JTextField txt = new JTextField("Enter text here:");
    public WindowEventDemo(){
        addWindowListener(this);
        setLayout(null);
        txt.setBounds(50,50,100,80);
        txt.setToolTipText("Wrong");
        add(txt);
        setSize(400,400);
        setVisible(true);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }
    @Override
    public void windowOpened(WindowEvent e) {
        System.out.println("Windows opened first");
    }

    @Override
    public void windowClosing(WindowEvent e) {
        System.out.println("Window is closing");
    }

    @Override
    public void windowClosed(WindowEvent e) {
        System.out.println("Window is closed");
    }

    @Override
    public void windowIconified(WindowEvent e) {
        System.out.println("Window is minimized");
    }

    @Override
    public void windowDeiconified(WindowEvent e) {
        System.out.println("Window is in normal state");
    }

    @Override
    public void windowActivated(WindowEvent e) {
        System.out.println("Active Window");
    }

    @Override
    public void windowDeactivated(WindowEvent e) {
        System.out.println("Window is not active");
    }
}
