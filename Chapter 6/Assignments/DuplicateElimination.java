import java.util.Scanner;

public class DuplicateElimination{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] uniqueValues = new int[5];
        int count = 0;

		//This loop ensures that the user enters a number between 10 and 100.
		
        for (int i = 0; i < 5; i++) {
            int input;
            while (true) {
                System.out.print("Enter number " + (i + 1) + " (10-100): ");
                input = scanner.nextInt();
                if (input >= 10 && input <= 100) {
                    break;
                }
                System.out.println("Invalid input. Please enter a number between 10 and 100.");
            }

		//This loop checks if the input number is already in the uniqueValues array.

            boolean isDuplicate = false;
            for (int j = 0; j < count; j++) {
                if (uniqueValues[j] == input) {
                    isDuplicate = true;
                    break;
                }
            }

			//Checks if the input number is not a duplicate, and if it's not, then it's added to the uniqueValues array.
			
            if (!isDuplicate) {
                uniqueValues[count++] = input;
            }
		
			//Displaying the unique values entered so far.
            System.out.println("Unique values:");
            for (int k = 0; k < count; k++) {
                System.out.print(uniqueValues[k] + " ");
            }
            System.out.println();
        }

        scanner.close();
    }
}