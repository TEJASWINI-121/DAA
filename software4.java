import java.net.*;
public class Example4 {
    public static void main(String[] args) throws Exception {
        InetAddress[] addresses = InetAddress.getAllByName("www.microsoft.com");
        for (InetAddress addr : addresses) {
            System.out.println("IP: " + addr.getHostAddress());
        }
    }}

