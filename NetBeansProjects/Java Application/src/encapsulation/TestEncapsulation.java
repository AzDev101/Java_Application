
package encapsulation;
import java.util.Scanner;

public class TestEncapsulation {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        
        /*System.out.print("Enter Account Number: ");
        String acctNumber = input.nextLine();
        
        System.out.print("Enter Account Name: ");
        String acctName = input.nextLine();
        
        System.out.print( "Enter Account BVN: ");
        String BVN = input.nextLine();
        
        System.out.print("Enter Account Balance: ");
        double balance = input.nextDouble();
        input.nextLine();
        
        System.out.print( "Enter Account Type: ");
        String acctType = input.nextLine();*/
        
        System.out.println("=================");
        System.out.println(" ");
        
        EncapsulationPractice encap = new EncapsulationPractice("6667783838784","John Doe");
        encap.display();
        System.out.println("");
        
        EncapsulationPractice acct1 = new EncapsulationPractice("6667786363684","Jack Griffo");
        acct1.display();
        System.out.println("");
        
        EncapsulationPractice acct2 = new EncapsulationPractice("66635673884","James John");
        acct2.display();
        System.out.println("");

        
        
        
        
        
        
        
        
        
        
        
        
        
        EncapsulationPractice encaps = new EncapsulationPractice();
        encaps.display();
    }
    
}
