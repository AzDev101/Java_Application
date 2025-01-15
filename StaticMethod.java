import java.util.Scanner;

public class StaticMethod{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		
		//Methods without parameters
		StaticMethod.sum();
		//Methods with parameters
		StaticMethod.divide(90, 70);
		//Methods with return value
		System.out.println(StaticMethod.product());
		
		System.out.print("Enter full name: ");
		String name = scan.nextLine();
		
		System.out.println(StaticMethod.personName(name));
	}
	public static void sum() {
		int x = 50;
		int y = 30;
		int total = x+y;
		System.out.printf("Sum of the two numbers is %d%n", total);		
	}
	public static void divide(int x, int y){
		double total = (double) x/y;
		System.out.printf("The second sum of the two numbers is %f%n", total);		
	}
	public static int product(){
		int x = 60;
		int y = 10;
		int mul;
		return mul = x * y;
	}
	public static String personName(String fullName){
		return fullName;
	}
}