public class TestCalculator {
    public static void main(String[] args) {
        final double firstNum = 6, secondNum = 5;
        Operation operazione = new Operation();
        System.out.println("Si esegue la somma tra" + firstNum + " e " + secondNum);
        System.out.println("il risultato è: " + operazione.sum(firstNum, secondNum));

    }

}
