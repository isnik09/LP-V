package MyRMI;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class RemoteImplementation extends UnicastRemoteObject implements RemoteInterface {
    private String message;

    public RemoteImplementation() throws RemoteException {
        super();
        message = "Hello from server!";
    }

    public String getMessage() throws RemoteException {
        return message;
    }
}
