import java.io.*;
import java.net.*;

public class server {
    public static void main(String[] args) {
        try (ServerSocket serverSocket = new ServerSocket(8080)) {
            System.out.println("Server is listening on port 8080");
            Socket socket = serverSocket.accept();
            System.out.println("Client connected");

            InputStream input = socket.getInputStream();
            BufferedReader reader = new BufferedReader(new InputStreamReader(input));

            OutputStream output = socket.getOutputStream();
            PrintWriter writer = new PrintWriter(output, true);

            String message;
            while ((message = reader.readLine()) != null) {
                System.out.println("Received from client: " + message);
                writer.println("Echo: " + message);
            }
            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
