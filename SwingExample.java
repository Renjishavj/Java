import javax.swing.*;

public class SwingExample {
    public static void main(String[] args) {
        // Creating a frame
        JFrame frame = new JFrame("Swing Example");

        // Creating a button
        JButton button = new JButton("Click Me");
        button.setBounds(50, 100, 95, 30); // x, y, width, height

        // Adding button to frame
        frame.add(button);

        // Setting frame properties
        frame.setSize(400, 400);
        frame.setLayout(null); // No layout manager
        frame.setVisible(true);

        // Action listener for button
        button.addActionListener(e -> JOptionPane.showMessageDialog(frame, "Button Clicked"));
    }
}
