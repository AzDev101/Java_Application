
package chapter_10.polymorphism;

public class Animal {
   String name;
   int age;
   
   public void sound(){
       System.out.println("All animals make sounds");
   }
   public void sound(int numberOfTimes){
       for(int i = 1; i <= numberOfTimes; i++){
           sound();
       }
   }
}
