import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Buffer {
    public static void main(String[] args) {
        
        String inputFile = "input.txt";
       
        String outputFile = "output.txt";

        
        try (BufferedReader br = new BufferedReader(new FileReader(inputFile));
             BufferedWriter bw = new BufferedWriter(new FileWriter(outputFile))) {

            String line;
            while ((line = br.readLine()) != null) {
                
                System.out.println(line);

                
                bw.write(line);
                bw.newLine(); 
            }

            System.out.println("File reading and writing completed.");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
