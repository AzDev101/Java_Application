//4.12 Calculating the Product of Odd Integers

public class ProductOfOdds {
    public static void main(String[] args) {
        int product = 1;
        for (int i = 1; i <= 15; i++) {
            if (i % 2 != 0) {
                product *= i;
            }
        }
        System.out.println("Product of odd integers from 1 to 15: " + product);
    }
}

