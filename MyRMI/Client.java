package MyRMI;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class Client {
    public static void main(String[] args) {
        try {
            Registry registry = LocateRegistry.getRegistry("localhost", 1099); // Connect to the server
            RemoteInterface stub = (RemoteInterface) registry.lookup("RemoteInterface");

            String message = stub.getMessage();
            System.out.println("Server message: " + message);
        } catch (Exception e) {
            System.err.println("Client exception: " + e.toString());
            e.printStackTrace();
        }
    }
}
