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
            System.out.println("Input error: " + e);
        }

        if (input_string.equalsIgnoreCase("quit"))
            System.exit(0);

        return input_string;
    }

    public double get_number(double prev_result) {
        String s = this.get_string("Write a real number (or ANS to use previous result)\n> ");
        if (s.equalsIgnoreCase("ANS"))
            return prev_result;

        /* Replace , with . */
        s = s.replace(",", ".");

        /* Check that the input only contains numeric input */
        if (s.contains("[0-9\\.]"))
            throw new IllegalArgumentException("It isn't a number");

        return Double.parseDouble(s);
    }

    public String get_operation() {
        String[] answers = { "+", "-", "*", "/", "cos", "sin", "tan" };

        String s = this.get_string(
                "What operation do you want? [Addition(+), Subtraction(-), Multiplication(*), Division(/), Cosine(cos), Sine(sin), Tangent(tan)]\n> ");

        for (String answer : answers)
            if (s.equals(answer))
                return answer;

        throw new IllegalArgumentException("Not a valid operation!");
    }

    public int get_angle_mode() {
        String[] answers = { "rad", "deg" };

        String s = this.get_string("Which angle mode? [deg, rad]\n> ");

        for (int i = 0; i < answers.length; i++)
            if (s.equalsIgnoreCase(answers[i]))
                return i;

        throw new IllegalArgumentException("Not a valid operation!");
    }

}