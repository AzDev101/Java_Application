import java.util.Random;

public class DiceRollingSimulation{

    public static void main(String[] args) {
        Random random = new Random();
        int[] frequency = new int[11]; // Possible sums range from 2 to 12

        // Roll the dice 36,000,000 times
        for (int i = 0; i < 36_000_000; i++) {
            int sum = rollDice(random);
            frequency[sum - 2]++; // Adjust index since array starts at 0
        }

        // Display the results
        System.out.println("Dice Rolling Simulation Results:");
        System.out.println("----------------------------------------");
        System.out.printf("%-4s %-10s%n", "Sum", "Frequency");
        System.out.println("----------------------------------------");

        for (int i = 2; i <= 12; i++) {
            System.out.printf("%-4d %-10d%n", i, frequency[i - 2]);
        }

        System.out.println("----------------------------------------");
    }

    // Method to roll two dice and return their sum
    private static int rollDice(Random random) {
        int die1 = random.nextInt(6) + 1; // Generate a random number between 1 and 6
        int die2 = random.nextInt(6) + 1; // Generate a random number between 1 and 6
        return die1 + die2;
    }
}
