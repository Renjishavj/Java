import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SimpleCalculator {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Simple Calculator");

        // Text fields
        JTextField num1Field = new JTextField();
        num1Field.setBounds(30, 40, 100, 30);
        JTextField num2Field = new JTextField();
        num2Field.setBounds(150, 40, 100, 30);

        // Labels
        JLabel resultLabel = new JLabel("Result:");
        resultLabel.setBounds(30, 80, 100, 30);

        // Buttons
        JButton addButton = new JButton("+");
        addButton.setBounds(30, 120, 50, 30);
        JButton subtractButton = new JButton("-");
        subtractButton.setBounds(90, 120, 50, 30);
        JButton multiplyButton = new JButton("*");
        multiplyButton.setBounds(150, 120, 50, 30);
        JButton divideButton = new JButton("/");
        divideButton.setBounds(210, 120, 50, 30);

        // Action listeners for buttons
        addButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int num1 = Integer.parseInt(num1Field.getText());
                int num2 = Integer.parseInt(num2Field.getText());
                int result = num1 + num2;
                resultLabel.setText("Result: " + result);
            }
        });

        subtractButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int num1 = Integer.parseInt(num1Field.getText());
                int num2 = Integer.parseInt(num2Field.getText());
                int result = num1 - num2;
                resultLabel.setText("Result: " + result);
            }
        });

        multiplyButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int num1 = Integer.parseInt(num1Field.getText());
                int num2 = Integer.parseInt(num2Field.getText());
                int result = num1 * num2;
                resultLabel.setText("Result: " + result);
            }
        });

        divideButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int num1 = Integer.parseInt(num1Field.getText());
                int num2 = Integer.parseInt(num2Field.getText());
                if (num2 != 0) {
                    int result = num1 / num2;
                    resultLabel.setText("Result: " + result);
                } else {
                    resultLabel.setText("Cannot divide by zero");
                }
            }
        });

        // Adding components to the frame
        frame.add(num1Field);
        frame.add(num2Field);
        frame.add(resultLabel);
        frame.add(addButton);
        frame.add(subtractButton);
        frame.add(multiplyButton);
        frame.add(divideButton);

        // Setting frame properties
        frame.setSize(300, 200);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
