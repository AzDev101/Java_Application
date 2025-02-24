
package chapter11_assignment;


public class CatchBlockOrder {
    public static void main(String[] args) {
        try {
            throw new ArithmeticException("Arithmetic Exception");
        }catch (Exception e) { // This catch block must come after the more specific one
            System.out.println("Caught Exception: " + e.getMessage());
        }    
    }
}
 
