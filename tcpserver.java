import java.io.*;import java.net.*;
public class tcpserver {
    public static void main(String[] args) throws IOException {
        ServerSocket server = new ServerSocket(5000);
        System.out.println("TCP Server started on port 5000...");

        Socket client = server.accept();
        System.out.println("Client connected: " + client.getInetAddress());

        BufferedReader in = new BufferedReader(new InputStreamReader(client.getInputStream()));
        PrintWriter out = new PrintWriter(client.getOutputStream(), true);

        BufferedReader console = new BufferedReader(new InputStreamReader(System.in));
        String msg;

        while ((msg = in.readLine()) != null) {
            System.out.println("Client: " + msg);
            System.out.print("You: ");
            out.println(console.readLine());
        }

        client.close();
        server.close();
    }}

