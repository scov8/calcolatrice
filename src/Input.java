import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Input {
    private BufferedReader reader;

    public Input() {
        this.reader = new BufferedReader(new InputStreamReader(System.in));
    }

    private String get_string(String prompt) {
        String input_string = "";
        try {
            System.out.print(prompt);
            input_string = this.reader.readLine().trim();
        } catch (IOException e) {
            System.out.println("Errore input: " + e);
        }
        return input_string;
    }

    public double get_number() {
        String s = this.get_string("Dammi un numero\n> ");
        if (s.contains("[^\\d]"))
            System.out.println("Non è un numero");
        return Double.parseDouble(s);
    }

    public String get_operation() throws ValueException {
        String[] answers = { "+", "-", "*", "/" };

        String s = this.get_string("Quale operazione? [+;-;*;/]\n> ");

        for (String answer : answers) {
            if (s.equals(answer))
                return answer;
        }
        throw new ValueException("Not a valid operation!");
    }
}