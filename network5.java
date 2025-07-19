import java.io.*;
import java.net.*;
public class network5 {
    public static void main(String[] args) {
        try (ServerSocket serverSocket = new ServerSocket(6000)) {
            System.out.println("Server started. Waiting for client...");
            Socket clientSocket = serverSocket.accept();
            System.out.println("Client connected: " + clientSocket.getInetAddress());

            BufferedWriter writer = new BufferedWriter(
                new OutputStreamWriter(clientSocket.getOutputStream())
            );
            writer.write("Welcome to the simple Java server!\n");
            writer.flush();
            clientSocket.close();
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}

