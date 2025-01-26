import java.util.Random;

public class SalesCommission {
    public static void main(String[] args) {
        // Initialize counters for each salary range
        int[] salaryRanges = new int[10];

        // Define salary ranges
        int[][] ranges = {{200, 299}, {300, 399}, {400, 499}, {500, 599},
                {600, 699}, {700, 799}, {800, 899}, {900, 999}, {1000, Integer.MAX_VALUE}};

        // Number of salespeople
        int numSalespeople = 10;

        // Simulate sales data (replace with actual data)
        Random random = new Random();
        for (int i = 0; i < numSalespeople; i++) {
            int sales = random.nextInt(10001); // 0 to 10,000
            int salary = 200 + (int) (sales * 0.09);

            // Update counter for the corresponding salary range
            for (int j = 0; j < ranges.length; j++) {
                if (salary >= ranges[j][0] && salary <= ranges[j][1]) {
                    salaryRanges[j]++;
                    break;
                }
            }
        }

        // Print results
        System.out.println("Salary Range\tNumber of Salespeople");
        for (int i = 0; i < ranges.length; i++) {
            if (ranges[i][1] == Integer.MAX_VALUE) {
                System.out.println("$" + ranges[i][0] + " and over\t" + salaryRanges[i]);
            } else {
                System.out.println("$" + ranges[i][0] + "-" + ranges[i][1] + "\t" + salaryRanges[i]);
            }
        }
    }
}