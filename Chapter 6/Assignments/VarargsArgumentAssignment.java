import java.util.Scanner;

public class VarargsArgumentAssignment{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		System.out.print("How many numbers do you wish to input?: ");
		int size = input.nextInt();
		
		int i = 0;
		int [] num = new int[size];
		
		while (true) {
			System.out.print("Enter a number (Enter -1 to end): ");
			num[i] = input.nextInt();
			System.out.println(" ");
			
			if (i == size-1){
				System.out.println("You have reached the max limit!");
				break;
			}
			
			if (num[i] == -1){
				break;
			}
			i++;
		}
		System.out.println(VarargsArgumentAssignment.add(num));
	}
	
	public static int add(int...num){
		int sum = 0;
		for (int number : num){
			sum += number;
		}
		return sum;
	}
}		