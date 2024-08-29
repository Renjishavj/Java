import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SimpleForm {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Simple Form");

        // Labels
        JLabel nameLabel = new JLabel("Name:");
        nameLabel.setBounds(20, 20, 80, 25);
        JLabel ageLabel = new JLabel("Age:");
        ageLabel.setBounds(20, 60, 80, 25);

        // Text fields
        JTextField nameField = new JTextField();
        nameField.setBounds(100, 20, 165, 25);
        JTextField ageField = new JTextField();
        ageField.setBounds(100, 60, 165, 25);

        // Button
        JButton submitButton = new JButton("Submit");
        submitButton.setBounds(100, 100, 100, 25);

        // Adding action listener to the button
        submitButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String name = nameField.getText();
                String age = ageField.getText();
                JOptionPane.showMessageDialog(frame, "Name: " + name + "\nAge: " + age);
            }
        });

        // Adding components to the frame
        frame.add(nameLabel);
        frame.add(ageLabel);
        frame.add(nameField);
        frame.add(ageField);
        frame.add(submitButton);

        // Setting frame properties
        frame.setSize(300, 200);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
