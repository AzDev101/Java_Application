
package chapter11_assignment;


public class RethrowingExceptions {
    public static void main(String[] args) {
        try {
        someMethod();
        } catch (Exception e) {
          System.out.println("Caught exception in main:");
          e.printStackTrace();
        }
    }
    public static void someMethod() throws Exception {
            try {
                someMethod2();
            } catch (Exception e) {
                System.out.println("Caught exception in someMethod:");
                throw e; // Rethrow the exception
            }
    }
    public static void someMethod2() throws Exception {
        throw new Exception("Exception thrown in someMethod2");
    }     
}
      
 

   

    
