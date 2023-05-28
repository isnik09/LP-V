package CalculatorApp;

import org.omg.CORBA.ORB;
import org.omg.CosNaming.*;
import org.omg.PortableServer.*;
import org.omg.PortableServer.POA;

public class Server {
    public static void main(String[] args) {
        try {
            // Create and initialize the ORB
            ORB orb = ORB.init(args, null);

            // Get the reference to the root POA and activate the POAManager
            POA rootPOA = POAHelper.narrow(orb.resolve_initial_references("RootPOA"));
            rootPOA.the_POAManager().activate();

            // Create the server object
            CalculatorImpl calculatorImpl = new CalculatorImpl();

            // Get the object reference for the server object
            org.omg.CORBA.Object ref = rootPOA.servant_to_reference(calculatorImpl);
            CalculatorApp.Calculator href = CalculatorApp.CalculatorHelper.narrow(ref);

            // Get the root naming context
            org.omg.CORBA.Object objRef = orb.resolve_initial_references("NameService");
            NamingContextExt ncRef = NamingContextExtHelper.narrow(objRef);

            // Bind the server object reference to the naming service
            String name = "Calculator";
            NameComponent[] path = ncRef.to_name(name);
            ncRef.rebind(path, href);

            System.out.println("Server is running...");

            // Wait for client invocations
            orb.run();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
