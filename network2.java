import java.net.URI;
import java.net.URISyntaxException;
public class network2{
    public static void main(String[] args) {
        try {
            // Create a URI from a string
            URI uri = new URI("https://www.example.com:8080/docs/tutorial?lang=en#section1");
            // Print different components of the URI
            System.out.println("Scheme: " + uri.getScheme());
            System.out.println("Host: " + uri.getHost());
            System.out.println("Port: " + uri.getPort());
            System.out.println("Path: " + uri.getPath());
            System.out.println("Query: " + uri.getQuery());
            System.out.println("Fragment: " + uri.getFragment());

        } catch (URISyntaxException e) {
            System.out.println("Invalid URI: " + e.getMessage());
        }
    }
}
