import java.util.Random;

public class RandomNumbers{
	public static void main(String args[]) {
		Random random = new Random();
		
		//create a variable to store the random number generated.
		int randomNum = random.nextInt();
		
		//print the random number
		System.out.printf("Random Number is : %d%n", randomNum);
		
		//Generating a number within a range
		int randomNumInRange = random.nextInt(20) + 1;
		
		System.out.printf("Random Number In Range is : %d%n", randomNumInRange);
		
		//Generating a float-point number
		double floatpointNum = random.nextDouble();
		
		System.out.printf("Random Double Number is : %.2f%n",floatpointNum);
		
		//Generating a float-point number within a range
		
		double min = 10.0;
		double max = 20.0;
		
		
		double randomFloatPointInRange = min + (max - min)* random.nextDouble();
		
		System.out.printf("Random Double Number In Range is : %.2f%n", randomFloatPointInRange);
		
		//Generate a random boolean value
		boolean booleanvalue = random.nextBoolean();
		
		System.out.printf("Random Booolean Value is : %b%n",randomFloatPointInRange);
	}
}