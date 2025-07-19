import java.net.URI;
import java.net.URL;
public class network {
    public static void main(String[] args) {
        try {
            URI uri = new URI("https://www.google.com");
            URL url = uri.toURL(); // Safe and modern way
            System.out.println("URL: " + url);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
