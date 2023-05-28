package CalculatorApp;

import CalculatorApp.Calculator;
import CalculatorApp.CalculatorHelper;
import org.omg.CORBA.ORB;

public class Client {
    public static void main(String[] args) {
        try {
            // Create and initialize the ORB
            ORB orb = ORB.init(args, null);

            // Get the root naming context
            org.omg.CORBA.Object objRef = orb.resolve_initial_references("NameService");
            NamingContextExt ncRef = NamingContextExtHelper.narrow(objRef);

            // Resolve the server object from the naming service
            String name = "Calculator";
            Calculator calculator = CalculatorHelper.narrow(ncRef.resolve_str(name));

            // Perform remote method invocations
            float num1 = 10;
            float num2 = 5;
            float result = calculator.add(num1, num2);
            System.out.println("Addition: " + num1 + " + " + num2 + " = " + result);

            result = calculator.subtract(num1, num2);
            System.out.println("Subtraction: " + num1 + " - " + num2 + " = " + result);

            result = calculator.multiply(num1, num2);
            System.out.println("Multiplication: " + num1 + " * " + num2 + " = " + result);

            result = calculator.divide(num1, num2);
            System.out.println("Division: " + num1 + " / " + num2 + " = " + result);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
