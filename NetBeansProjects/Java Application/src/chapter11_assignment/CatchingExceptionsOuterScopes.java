
package chapter11_assignment;


public class CatchingExceptionsOuterScopes {
    public static void main(String[] args) {
        try {
            someMethod();
        } catch (ArithmeticException e) {
            System.out.println("Caught ArithmeticException in main:");
            System.out.println(e.getMessage());
        }
    }

    public static void someMethod() {
        try {
            someMethod2();
        } catch (NullPointerException e) {
            System.out.println("Caught NullPointerException in someMethod:");
            System.out.println(e.getMessage());
        }
    }

    public static void someMethod2() {
        int x = 5 / 0; // Throws ArithmeticException
        String s = null;
        s.length(); // Throws NullPointerException
    }
}
