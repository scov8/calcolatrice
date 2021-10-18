import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class App {
    public static void main(String[] args) throws Exception {
        Input i = new Input();
        String selectMenu = i.get_operation();
        Operation operationType = new Operation();

        switch (selectMenu) {
            case "+": // Addizione
                operationType.sum(i.get_number(), i.get_number());
                break;
            case "-": // Sottrazione
                operationType.substract(i.get_number(), i.get_number());
                break;
            case "*": // Moltiplicazione
                operationType.moltiplicate(i.get_number(), i.get_number());
                break;
            case "/": // Divisione
                operationType.moltiplicate(i.get_number(), i.get_number());

                break;
        }

    }
}
