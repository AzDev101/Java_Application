import java.util.Scanner;

public class SwitchStatement{
	public static void main (String [] args){
		Scanner scan = new Scanner (System.in);
		
		int score;
		String name ;
		
		System.out.print("Enter your name: ");
		name = scan.nextLine();
		
		System.out.print("Enter your score: ");
		score = scan.nextInt();
		int grade = score / 10;
		
		switch (grade){
			case 10:
			case 9:
					System.out.println(name + " your grade is Outstanding");
			break;
			
			case 8:
			case 7:
			case 6:
					System.out.println(name + " your grade is Excellent");
			break;
			
			case 5:
					System.out.println(name + " your grade is Good");
			break;
			
			case 4:
					System.out.println(name + " your grade is Average");
			break;
			
			case 3:
			case 2:
			case 1:
			case 0:
					System.out.println(name + " your grade is pooor");
			break;
			
			default:
					System.out.println("Invalid Input!");
		}
		
		
	}
}