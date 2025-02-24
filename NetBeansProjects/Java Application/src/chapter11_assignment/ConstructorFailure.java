
package chapter11_assignment;

class SomeClass {
    public SomeClass() throws Exception {
        throw new Exception("Constructor failure");
    }
}


public class ConstructorFailure {
    public static void main(String[] args) {
        try {
            SomeClass someObject = new SomeClass();
        } catch (Exception e) {
            System.out.println("Caught Exception: " + e.getMessage());
        }
    }
}

/*In this program, the constructor of `SomeClass` throws an `Exception` with the message"Constructor failure". 
In the `main` method, we try to create an object of type `SomeClass` and catch the exception that's thrown from the constructor.*/
