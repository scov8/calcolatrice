import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class App {
    public static void main(String[] args) throws Exception {
        Input i = new Input();
        String selectMenu = i.get_operation();
        Operation operationType = new Operation();
        Double result = 0.0;

        switch (selectMenu) {
            case "+": // Addizione
                result = operationType.sum(i.get_number(), i.get_number());
                break;
            case "-": // Sottrazione
                result = operationType.substract(i.get_number(), i.get_number());
                break;
            case "*": // Moltiplicazione
                result = operationType.multiplication(i.get_number(), i.get_number());
                break;
            case "/": // Divisione
                result = operationType.division(i.get_number(), i.get_number());
                break;
        }

        System.out.print("the result is: " + result + "\n");
    }
}
