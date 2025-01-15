//4.14 Modified Compound-Interest Program


public class ModifiedCompoundInterest {
    public static void main(String[] args) {
        double principal = 1000.0;
        int years = 10;

        System.out.printf("Year\t\t5%%\t\t6%%\t\t7%%\t\t8%%\t\t9%%\t\t10%%%n");

        for (int year = 1; year <= years; year++) {
            System.out.print(year + "\t\t");
            for (double rate = 0.05; rate <= 0.10; rate += 0.01) {
                double balance = principal * Math.pow(1 + rate, year);
                System.out.printf("%.2f\t\t", balance);
            }
            System.out.println();
        }
    }
}

