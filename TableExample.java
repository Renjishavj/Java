import javax.swing.*;

public class TableExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("JTable Example");

        // Data for the table
        String[][] data = {
            { "1", "John", "25" },
            { "2", "Paul", "30" },
            { "3", "George", "28" },
            { "4", "Ringo", "26" }
        };

        // Column names
        String[] columns = { "ID", "Name", "Age" };

        // Creating the table
        JTable table = new JTable(data, columns);
        JScrollPane sp = new JScrollPane(table); // Adding table to scroll pane
        sp.setBounds(20, 20, 300, 100);

        // Adding scroll pane to the frame
        frame.add(sp);

        // Setting frame properties
        frame.setSize(400, 200);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
