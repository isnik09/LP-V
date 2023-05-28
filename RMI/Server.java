package RMI;
import java.rmi.*;
// import java.net.*;

public class Server {
    public static void main(String[] args) {
        try {
            Servant s = new Servant();
            Naming.rebind("Server", s);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
