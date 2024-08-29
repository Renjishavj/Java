import javax.swing.*;
import java.awt.event.*;

public class TwoButtonExample {
    public static void main(String[] args) {
        
        JFrame frame = new JFrame("Two Button Example");

       
        JLabel label = new JLabel("Press a button!");
        label.setBounds(50, 50, 200, 30);

        
        JButton changeTextButton = new JButton("Change Text");
        changeTextButton.setBounds(50, 100, 150, 30);

       
        JButton closeButton = new JButton("Close");
        closeButton.setBounds(50, 150, 150, 30);

       
        changeTextButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                label.setText("Text has been changed!");
            }
        });

        
        closeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0); // Close the application
            }
        });

        
        frame.add(label);
        frame.add(changeTextButton);
        frame.add(closeButton);

       
        frame.setSize(300, 300);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
