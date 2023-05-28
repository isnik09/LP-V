package MyRMI;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface RemoteInterface extends Remote {
    String getMessage() throws RemoteException;
}



