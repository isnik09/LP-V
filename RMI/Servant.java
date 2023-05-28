package RMI;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
// import java.rmi.*;
// import java.rmi.server.*;

public class Servant extends UnicastRemoteObject implements Interface {
    protected Servant() throws RemoteException {
        super();
    }

    @Override
    public String concat(String a, String b) throws RemoteException {
        return a + b;
    }
}
