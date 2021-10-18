import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * This class contains all the methods used to get input from the user.
 */
public class Input {
    /**
     * Used to read from stdin.
     */
    private BufferedReader reader;

    public Input() {
        this.reader = new BufferedReader(new InputStreamReader(System.in));
    }

    /**
     * Private function to get a string from stdin.
     * 
     * @param prompt The prompt to display to let the user know what is the nature
     *               of the input
     * @return String read in input.
     */
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

    /**
     * public function that take from input a number
     * 
     * @param prev_result the previous result, it is used to implement the ANS
     *                    feature.
     * @return Real number taken in input.
     */
    public double get_number(double prev_result) {
        String s = this.get_string("Write a real number (or ANS to use previous result)\n> ");
        if (s.equalsIgnoreCase("ANS"))
            return prev_result;

        /* Replace , with . */
        s = s.replace(",", ".");

        /* Check that the input only contains digits and . */
        if (s.contains("[0-9\\.]"))
            throw new IllegalArgumentException("It isn't a number");

        return Double.parseDouble(s);
    }

    /**
     * Public function to get in input the type of operation to execute.
     * 
     * @return String representing the operation.
     */
    public String get_operation() {
        String[] answers = { "+", "-", "*", "/", "cos", "sin", "tan" };

        String s = this.get_string(
                "What operation do you want? [Addition(+), Subtraction(-), Multiplication(*), Division(/), Cosine(cos), Sine(sin), Tangent(tan)]\n> ");

        for (String answer : answers)
            if (s.equals(answer))
                return answer;

        throw new IllegalArgumentException("Not a valid operation!");
    }

    /**
     * This function reads from stdin which type of angle the user wants to use as
     * input for trigonometric operations.
     * 
     * @return 1 if user selected deg, 0 if user selected rad
     */
    public int get_angle_mode() {
        String[] answers = { "rad", "deg" };

        String s = this.get_string("Which angle mode? [deg, rad]\n> ");

        for (int i = 0; i < answers.length; i++)
            if (s.equalsIgnoreCase(answers[i]))
                return i;

        throw new IllegalArgumentException("Not a valid operation!");
    }

}