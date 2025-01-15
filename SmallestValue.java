//4.11 Find the Smallest Value

import java.util.Scanner;

public class SmallestValue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of values: ");
        int n = scanner.nextInt();
        int smallest = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++) {
            System.out.print("Enter value " + (i + 1) + ": ");
            int value = scanner.nextInt();
            if (value < smallest) {
                smallest = value;
            }
        }

        System.out.println("Smallest value: " + smallest);
    }
}