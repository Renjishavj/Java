import javax.swing.*;
import java.awt.event.*;

public class WindowEventExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Window Event Example");

        
        frame.addWindowListener(new WindowListener() {
            @Override
            public void windowOpened(WindowEvent e) {
                System.out.println("Window opened!");
            }

            @Override
            public void windowClosing(WindowEvent e) {
                System.out.println("Window closing!");
            }

            @Override
            public void windowClosed(WindowEvent e) {
                System.out.println("Window closed!");
            }

            @Override
            public void windowIconified(WindowEvent e) {
                System.out.println("Window minimized!");
            }

            @Override
            public void windowDeiconified(WindowEvent e) {
                System.out.println("Window restored!");
            }

            @Override
            public void windowActivated(WindowEvent e) {
                System.out.println("Window activated!");
            }

            @Override
            public void windowDeactivated(WindowEvent e) {
                System.out.println("Window deactivated!");
            }
        });

        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
