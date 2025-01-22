import java.util.Scanner;

public class ArrayManipulation{
	public static void main(String [] args){
		Scanner scan = new Scanner(System.in);
		
		//an array to calculate the sum of numbers inputed by a user
		
		int [] numbers = new int[5];

		int sum = 0;
		
		for(int i = 0; i < 5; i++){
		System.out.print("Enter a number: ");
		numbers[i] = scan.nextInt();
		
		sum += numbers[i];
		}
		
		System.out.printf("The total number is %d", sum);
		
	}
}