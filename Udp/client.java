import java.io.*;
import java.net.*;

public class client {
    public static void main(String[] args) {
        String hostname = "localhost";
        int port = 8080;

        try (Socket socket = new Socket(hostname, port)) {
            OutputStream output = socket.getOutputStream();
            PrintWriter writer = new PrintWriter(output, true);

            InputStream input = socket.getInputStream();
            BufferedReader reader = new BufferedReader(new InputStreamReader(input));

            BufferedReader consoleReader = new BufferedReader(new InputStreamReader(System.in));
            String message;

            while (true) {
                System.out.print("Enter message: ");
                message = consoleReader.readLine();
                writer.println(message);
                
                String response = reader.readLine();
                System.out.println("Server replied: " + response);

                if ("exit".equalsIgnoreCase(message)) {
                    break;
                }
            }
            socket.close();
        } catch (UnknownHostException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
