//4.13 Factorials


public class Factorials {
    public static void main(String[] args) {
        System.out.println("Factorials of 1 through 20:");
        System.out.println("n\t\tn!");
        for (int i = 1; i <= 20; i++) {
            long factorial = 1;
            for (int j = 1; j <= i; j++) {
                factorial *= j;
            }
            System.out.printf("%d\t\t%,d%n", i, factorial);
        }
    }
}