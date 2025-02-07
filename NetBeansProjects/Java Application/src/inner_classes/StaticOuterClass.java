
package inner_classes;

public class StaticOuterClass {
    private static String message = "This is an outer class"; //Instance variable
    static int y = 50;// static variables
    
    public static void checkme(){
        System.out.println("This is a static method");
        
    }
    
    static class StaticInnerClass{ //No other class will be able to access this inner class
        int x = 10;
        public void display(){
            System.out.printf("%s%n",message);
            System.out.println( y);
            System.out.printf("%d%n", x);
            
            OuterClass.checkme();
        }
    }
    
    public static void main(String[] args) {
        StaticOuterClass.StaticInnerClass inner = new
        StaticOuterClass.StaticInnerClass();
        
        inner.display();
    }
}
