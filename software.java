import java.net.*;
public class software {
    public static void main(String[] args) throws Exception {
        InetAddress address = InetAddress.getByName("www.google.com");
        System.out.println("Host Name: " + address.getHostName());
        System.out.println("IP Address: " + address.getHostAddress());
}}
