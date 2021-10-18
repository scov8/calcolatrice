import java.lang.Math;

/**
 * This class contains all the methods used to carry out the operations
 */
public class Operation {
    /**
     * This is the constructor of the class.
     */
    public Operation() {
    }

    /**
     * This function calculates the sum between two real numbers
     * 
     * @param firstNumber  first operand of operation
     * @param secondNumber second operand of operation
     * @return the result of operation
     */
    public double sum(double firstNumber, double secondNumber) {
        return firstNumber + secondNumber;
    }

    /**
     * This function calculates the substraction between two real numbers
     * 
     * @param firstNumber  first operand of operation
     * @param secondNumber second operand of operation
     * @return the result of operation
     */
    public double substract(double firstNumber, double secondNumber) {
        return firstNumber - secondNumber;
    }

    /**
     * This function calculates the multiplication between two real numbers
     * 
     * @param firstNumber  first operand of operation
     * @param secondNumber second operand of operation
     * @return the result of operation
     */
    public double multiplication(double firstNumber, double secondNumber) {
        return firstNumber * secondNumber;
    }

    /**
     * This function calculates the division between two real numbers
     * 
     * @param firstNumber  first operand of operation
     * @param secondNumber second operand of operation
     * @return the result of operation
     */
    public double division(double firstNumber, double secondNumber) {
        return firstNumber / secondNumber;
    }

    /**
     * This function calculates the sine of a real number
     * 
     * @param angle the angle
     * @return the result of operation
     */
    public double sine(int mod, double angle) {
        if (mod == 1) /* 1 = degrees */
            angle = Math.toRadians(angle);
        return Math.sin(angle);
    }

    /**
     * This function calculates the cosine of a real number
     * 
     * @param angle the angle
     * @return the result of operation
     */
    public double cosine(int mod, double angle) {
        if (mod == 1) /* 1 = degrees */
            angle = Math.toRadians(angle);
        return Math.cos(angle);
    }

    /**
     * This function calculates the tangent of a real number
     * 
     * @param angle the angle
     * @return the result of operation
     */
    public double tangent(int mod, double angle) {
        if (mod == 1) /* 1 = degrees */
            angle = Math.toRadians(angle);
        return Math.tan(angle);
    }
}
