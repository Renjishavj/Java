import java.awt.*;
import java.awt.event.*;

public class AWTExample {
    public static void main(String[] args) {
        Frame frame = new Frame("AWT Example");

        
        Button button = new Button("Click Me");
        button.setBounds(50, 100, 80, 30);

        
        frame.add(button);

        
        frame.setSize(300, 300);
        frame.setLayout(null); 
        frame.setVisible(true);

       
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println("Button Clicked");
            }
        });
    }
}
