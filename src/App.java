import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class App {
    public static void main(String[] args) throws Exception {

        String operazione;
        System.out.println(
                "What operation do you want?(write the number or the symbol of the operation)\n1-Add(+)\n2-Subtract(-)\n3-Multiplicate(*)\n4-Divide(/)");
        try {
            BufferedReader bufferRead = new BufferedReader(new InputStreamReader(System.in));
            selectMenu = bufferRead.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("");
        try {
            BufferedReader bufferRead = new BufferedReader(new InputStreamReader(System.in));
            String operation = bufferRead.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }

        switch (selectMenu) {
            case "1": // Addizione
                break;
            case "2": // Sottrazione
                break;
            case "3": // Moltiplicazione
                break;
            case "4": // Divisione
                break;
            default:
                System.out.println("Error, try again!");
                break;
        }

        Input i = new Input();
        double x = i.get_number();

    }
}
