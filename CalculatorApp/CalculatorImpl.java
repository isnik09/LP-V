package CalculatorApp;
import CalculatorApp.CalculatorPOA;

public class CalculatorImpl extends CalculatorPOA {
    @Override
    public float add(float num1, float num2) {
        return num1 + num2;
    }

    @Override
    public float subtract(float num1, float num2) {
        return num1 - num2;
    }

    @Override
    public float multiply(float num1, float num2) {
        return num1 * num2;
    }

    @Override
    public float divide(float num1, float num2) {
        if (num2 != 0) {
            return num1 / num2;
        } else {
            throw new ArithmeticException("Division by zero!");
        }
    }
}
