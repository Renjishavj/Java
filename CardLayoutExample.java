import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CardLayoutExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("CardLayout Example");

        // Creating the panel with CardLayout
        JPanel cardPanel = new JPanel();
        CardLayout cardLayout = new CardLayout();
        cardPanel.setLayout(cardLayout);

        
        JPanel card1 = new JPanel();
        card1.add(new JLabel("Card 1"));
        JPanel card2 = new JPanel();
        card2.add(new JLabel("Card 2"));

        
        cardPanel.add(card1, "Card 1");
        cardPanel.add(card2, "Card 2");

       
        JButton button1 = new JButton("Show Card 1");
        button1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(cardPanel, "Card 1");
            }
        });

        JButton button2 = new JButton("Show Card 2");
        button2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(cardPanel, "Card 2");
            }
        });

        
        frame.setLayout(new BorderLayout());
        frame.add(button1, BorderLayout.NORTH);
        frame.add(button2, BorderLayout.SOUTH);
        frame.add(cardPanel, BorderLayout.CENTER);

       
        frame.setSize(400, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
