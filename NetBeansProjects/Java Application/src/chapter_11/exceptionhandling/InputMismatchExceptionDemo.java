
package chapter_11.exceptionhandling;
import java.util.Scanner;
import java.util.InputMismatchException;

public class InputMismatchExceptionDemo {
    public static void main(String[] args) {
        int num;
        Scanner scan = new Scanner(System.in);
        
        while(true){
        try{
            System.out.print("Enter  number: ");
            num = scan.nextInt();
            break;
        }
        catch(InputMismatchException e){
           scan.nextLine();
           System.out.println("Invalid Input, please provide a valid interger(number)");
        }
    }
        System.out.printf("%d is a valid integer %n", num);
    }
}
