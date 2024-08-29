import javax.swing.*;
import java.awt.event.*;

public class MouseEventExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Mouse Event Example");
        JLabel label = new JLabel("Hover over me!");

      
        label.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                System.out.println("Mouse clicked!");
            }

            @Override
            public void mousePressed(MouseEvent e) {
                System.out.println("Mouse pressed!");
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                System.out.println("Mouse released!");
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                System.out.println("Mouse entered the label area!");
            }

            @Override
            public void mouseExited(MouseEvent e) {
                System.out.println("Mouse exited the label area!");
            }
        });

        frame.add(label);
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
