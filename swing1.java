import javax.swing.*;  // Importing the Swing package
import java.awt.event.*;  // For handling events

public class swing1{
    public static void main(String[] args) {
        // Creating a new JFrame (a window)
        JFrame frame = new JFrame("Swing Example");

        // Creating a label
        JLabel label = new JLabel("Hello, Swing!");
        label.setBounds(20, 50, 100, 30); // x, y, width, height

        // Creating a button
        JButton button = new JButton("Click Me");
        button.setBounds(20, 100, 120, 30);

        // Adding an action listener to the button
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                label.setText("Button Clicked");
            }
        });

        // Adding components to the frame
        frame.add(label);
        frame.add(button);

        // Setting frame properties
        frame.setSize(300, 200);  // Width and height of the frame
        frame.setLayout(null);  // No layout manager
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  // Close the application when the window is closed
        frame.setVisible(true);  // Make the frame visible
    }
}
