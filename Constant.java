import java.util.Scanner;

public class Constant{
	
	static final double pi = 3.142;	
	
	static int age = 50;
		
	public static void main(String[] args){		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter the radius: ");
		int radius = scan.nextInt();
		
		Constant.area(radius);
	}
	public static void area(int radius){	
		double areaOfCircle = pi * radius * radius;
		System.out.printf("The area of the circle is %.2f", areaOfCircle);
		
		Constant.check();
	}
	public static void check(){
		if(age>= 18)
			System.out.printf("%nYes, you are an adult");
		else
			System.out.println("You are still a teenager");
	}
}
//Math class demo
//.pow,.sqrt,.pi,.min,.max,.double,.round,.random