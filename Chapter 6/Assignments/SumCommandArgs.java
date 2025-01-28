public class SumCommandArgs{

    public static void main(String[] args) {
        double sum = 0.0;

        if (args.length == 0) {
            System.out.println("No command-line arguments provided.");
            return;
        }

        for (String arg : args) {
            try {
                sum += Double.parseDouble(arg);
            } catch (NumberFormatException e) {
                System.out.println("Ignoring non-numeric argument: " + arg);
            }
        }

        System.out.println("Sum of command-line arguments: " + sum);
    }
}

