import javax.swing.*;
import java.awt.*;

public class GridBagLayoutExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("GridBagLayout Example");

       
        frame.setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();

        // Button 1 - will be at (0, 0)
        gbc.gridx = 0;
        gbc.gridy = 0;
        frame.add(new JButton("Button 1"), gbc);

        // Button 2 - will be at (1, 0)
        gbc.gridx = 1;
        gbc.gridy = 0;
        frame.add(new JButton("Button 2"), gbc);

        // Button 3 - will be at (0, 1) and span 2 columns
        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.gridwidth = 2;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        frame.add(new JButton("Button 3"), gbc);

       
        frame.setSize(400, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
