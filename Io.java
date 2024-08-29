import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Io {
    public static void main(String[] args) {
        
        try (FileReader fr = new FileReader("example.txt");
             FileWriter fw = new FileWriter("output.txt")) {
            
            int content;
            while ((content = fr.read()) != -1) {
                System.out.print((char) content); // Print to console
                fw.write(content); // Write to output.txt
            }
            
        } catch (IOException e) {
            e.printStackTrace();
        }
        
        
        String data = "Hello, World!";
        try (FileWriter fw = new FileWriter("output.txt", true)) { 
            fw.write("\n" + data); 
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
