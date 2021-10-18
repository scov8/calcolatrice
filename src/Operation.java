import java.lang.Math;

public class Operation {
    /**
     * This function is the constructor of class
     */
    public Operation() {
    }

    /**
     * This function calculate the sum between two real numbers
     * 
     * @param firstNumber  first operand of operation
     * @param secondNumber second operand of operation
     * @return the result of operation
     */
    public double sum(double firstNumber, double secondNumber) {
        return firstNumber + secondNumber;
    }

    /**
     * This function calculate the substract between two real numbers
     * 
     * @param firstNumber  first operand of operation
     * @param secondNumber second operand of operation
     * @return the result of operation
     */
    public double substract(double firstNumber, double secondNumber) {
        return firstNumber - secondNumber;
    }

    /**
     * This function calculate the moltiplicate between two real numbers
     * 
     * @param firstNumber  first operand of operation
     * @param secondNumber second operand of operation
     * @return the result of operation
     */
    public double multiplication(double firstNumber, double secondNumber) {
        return firstNumber * secondNumber;
    }

    /**
     * This function calculate the division between two real numbers
     * 
     * @param firstNumber  first operand of operation
     * @param secondNumber second operand of operation
     * @return the result of operation
     */
    public double division(double firstNumber, double secondNumber) {
        return firstNumber / secondNumber;
    }

    /**
     * This function calculate the sine of a real numbers
     * 
     * @param firstNumber first operand of operation
     * @return the result of operation
     */
    public double sine(int mod, double firstNumber) {
        if (mod == 1) /* 1 = gradi */
            firstNumber = Math.toRadians(firstNumber);
        return Math.sin(firstNumber);
    }

    /**
     * This function calculate the cosine of a real numbers
     * 
     * @param firstNumber first operand of operation
     * @return the result of operation
     */
    public double cosine(int mod, double firstNumber) {
        if (mod == 1) /* 1 = gradi */
            firstNumber = Math.toRadians(firstNumber);
        return Math.cos(firstNumber);
    }

    /**
     * This function calculate the tangent of a real numbers
     * 
     * @param firstNumber first operand of operation
     * @return the result of operation
     */
    public double tangent(int mod, double firstNumber) {
        if (mod == 1) /* 1 = gradi */
            firstNumber = Math.toRadians(firstNumber);
        return Math.tan(firstNumber);
    }
}
