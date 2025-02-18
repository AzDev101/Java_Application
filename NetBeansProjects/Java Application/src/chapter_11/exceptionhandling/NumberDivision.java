
package chapter_11.exceptionhandling;
import java.util.Scanner;

public class NumberDivision {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int divide;
        System.out.print("Enter fist number: ");
        int num1 = scan.nextInt();
        System.out.print("Enter second number: ");
        int num2 = scan.nextInt();
        try{
        divide = num1/num2;
        System.out.println(divide);
        }
        catch(ArithmeticException e){
           System.out.println("Error: Num1 cannot be divided by Zero");
        }
        finally{
        if(num1 > num2){
            System.out.printf("%d is greater than %d%n",num1,num2);
        }
        else{
           System.out.printf("%d is not greater than %d%n",num1,num2);
        }
        }
    }
}
