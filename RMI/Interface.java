package RMI;

import java.rmi.*;

public interface Interface extends Remote {
    String concat(String a, String b) throws RemoteException;
}
