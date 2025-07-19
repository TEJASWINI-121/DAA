import java.net.*;

public class simpledatagram {
    public static void main(String[] args) throws Exception {
        DatagramSocket socket = new DatagramSocket();
        String message = "Hello, UDP!";
        byte[] buffer = message.getBytes();

        InetAddress receiver = InetAddress.getByName("localhost");
        DatagramPacket packet = new DatagramPacket(buffer, buffer.length, receiver, 9000);
        socket.send(packet);
        socket.close();
    }
}
