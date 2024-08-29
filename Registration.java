import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Registration{
    public static void main(String[] args) {
        // Create a new JFrame container
        JFrame frame = new JFrame("Student Registration Form");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create a panel to hold the form elements
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(5, 2));

        // Create and add labels and text fields to the panel
        JLabel nameLabel = new JLabel("Name:");
        JTextField nameField = new JTextField();
        panel.add(nameLabel);
        panel.add(nameField);

        JLabel emailLabel = new JLabel("Email:");
        JTextField emailField = new JTextField();
        panel.add(emailLabel);
        panel.add(emailField);

        JLabel courseLabel = new JLabel("Course:");
        JTextField courseField = new JTextField();
        panel.add(courseLabel);
        panel.add(courseField);

        JLabel genderLabel = new JLabel("Gender:");
        String[] genders = {"Male", "Female", "Other"};
        JComboBox<String> genderBox = new JComboBox<>(genders);
        panel.add(genderLabel);
        panel.add(genderBox);

        // Create and add a submit button to the panel
        JButton submitButton = new JButton("Submit");
        panel.add(submitButton);

        // Create and add an empty label for displaying messages
        JLabel messageLabel = new JLabel();
        panel.add(messageLabel);

        // Add action listener to the submit button
        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name = nameField.getText();
                String email = emailField.getText();
                String course = courseField.getText();
                String gender = (String) genderBox.getSelectedItem();

                // Simple validation to check if fields are filled
                if (name.isEmpty() || email.isEmpty() || course.isEmpty()) {
                    messageLabel.setText("Please fill all fields.");
                } else {
                    // Display success message
                    messageLabel.setText("Registration Successful!");
                    // Optionally, you can clear the fields after submission
                    nameField.setText("");
                    emailField.setText("");
                    courseField.setText("");
                    genderBox.setSelectedIndex(0);
                }
            }
        });

        // Add the panel to the frame
        frame.add(panel);

        // Display the frame
        frame.setVisible(true);
    }
}
