import java.io.*;

public class CheckedException {
    public static void main(String[] args) {
        try {
            FileReader file = new FileReader("test.txt");
            BufferedReader fileInput = new BufferedReader(file);

            // Read first line
            System.out.println(fileInput.readLine());
            fileInput.close();
        } catch (IOException e) {
            System.out.println("File not found or unable to read file: " + e);
        }
    }
}
