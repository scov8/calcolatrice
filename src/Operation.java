public class Operation {

    public Operation() {
        /**
         * @brief This is the constructor of class
         */
    }

    public double sum(double firstNumber, double secondNumber) {
        /**
         * @brief This function calculate the sum between two real numbers
         * @param firstNumber  first operand of operation
         * @param secondNumber second operand of operation
         * @return the result of operation
         */
        return firstNumber + secondNumber;
    }

    public double substract(double firstNumber, double secondNumber) {
        /**
         * @brief This function calculate the substract between two real numbers
         * @param firstNumber  first operand of operation
         * @param secondNumber second operand of operation
         * @return the result of operation
         */
        return firstNumber - secondNumber;
    }

    public double moltiplicate(double firstNumber, double secondNumber) {
        /**
         * brief This function calculate the moltiplicate between two real numbers
         * 
         * @param firstNumber  first operand of operation
         * @param secondNumber second operand of operation
         * @return the result of operation
         */
        return firstNumber * secondNumber;
    }

    public double division(double firstNumber, double secondNumber) {
        /**
         * @brief This function calculate the division between two real numbers
         * @param firstNumber  first operand of operation
         * @param secondNumber second operand of operation
         */
        return firstNumber / secondNumber;
    }
}
