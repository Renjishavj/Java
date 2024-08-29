import javax.swing.*;
import java.awt.event.*;

public class KeyEventExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Key Event Example");
        JTextField textField = new JTextField();

       
        textField.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
                System.out.println("Key typed: " + e.getKeyChar());
            }

            @Override
            public void keyPressed(KeyEvent e) {
                System.out.println("Key pressed: " + e.getKeyChar());
            }

            @Override
            public void keyReleased(KeyEvent e) {
                System.out.println("Key released: " + e.getKeyChar());
            }
        });

        frame.add(textField);
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
