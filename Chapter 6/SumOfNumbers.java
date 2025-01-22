//write a java program to accept 10 numbers frm a user and display the sum of the second to sixth element 
//subtract from the sum of 7 to 9th element

import java.util.Scanner;

public class SumOfNumbers{
	public static void main(String [] args){
		Scanner scan = new Scanner(System.in);
		
		//an array to calculate the sum of numbers inputed by a user
		
		int [] numbers = new int[10];

		int sum1 = 0;
		int sum2 = 0;
		int result = 0;
		
		for(int i = 0; i < 10; i++){
		System.out.print("Enter a number: ");
		numbers[i] = scan.nextInt();
		
		sum1 = numbers[1] + numbers[2] + numbers[3] + numbers[4] + numbers[5];
		
		sum2 = numbers[6] + numbers[7] + numbers[8];
		
		result = sum2 - sum1;
		
		}
		
		System.out.printf("Result: ", result);
		
	}
}