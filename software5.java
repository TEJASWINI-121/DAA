import java.io.*;
import java.net.*;

public class software5 {
    public static void main(String[] args) {
        String serverAddress = "127.0.0.1"; // localhost
        int port = 5000;

        try (Socket socket = new Socket(serverAddress, port);
             DataOutputStream out = new DataOutputStream(socket.getOutputStream());
             BufferedReader input = new BufferedReader(new InputStreamReader(System.in))) {

            System.out.println("Connected to server at " + serverAddress + ":" + port);

            String message;
            while (!(message = input.readLine()).equalsIgnoreCase("exit")) {
                out.writeUTF(message);
            }

            System.out.println("Connection closed.");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
