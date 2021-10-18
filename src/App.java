public class App {
    public static void main(String[] args) throws Exception {
        Input i = new Input();
        Operation operationType = new Operation();
        String selectMenu;
        Double result = 0.0;

        System.out.println("At any time type, 'QUIT' to close the calculator.");

        while (true) {
            System.out.flush();
            selectMenu = i.get_operation();
            switch (selectMenu) {
                case "+": // Addiction
                    result = operationType.sum(i.get_number(result), i.get_number(result));
                    break;
                case "-": // Substraction
                    result = operationType.substract(i.get_number(result), i.get_number(result));
                    break;
                case "*": // Multiplication
                    result = operationType.multiplication(i.get_number(result), i.get_number(result));
                    break;
                case "/": // Division
                    result = operationType.division(i.get_number(result), i.get_number(result));
                    break;
                case "sin": // Sine
                    result = operationType.sine(i.get_angle_mode(), i.get_number(result));
                    break;
                case "cos": // Cosine
                    result = operationType.cosine(i.get_angle_mode(), i.get_number(result));
                    break;
                case "tan": // Tangent
                    result = operationType.tangent(i.get_angle_mode(), i.get_number(result));
                    break;
            }

            System.out.printf("The result is: %.3f\n", result);
        }
    }
}
