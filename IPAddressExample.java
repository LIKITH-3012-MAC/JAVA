import java.net.InetAddress;
import java.net.UnknownHostException;

public class IPAddressExample {
    public static void main(String[] args) throws UnknownHostException {
        InetAddress address = InetAddress.getLocalHost();
        System.out.println("IP Address: " + address.getHostAddress());
    }
}