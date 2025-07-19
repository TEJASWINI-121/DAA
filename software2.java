import java.net.*;
public class software2 {
    public static void main(String[] args) throws Exception {
        InetAddress local = InetAddress.getLocalHost();
        System.out.println("Local Host Name: " + local.getHostName());
        System.out.println("Local IP Address: " + local.getHostAddress());
}}

