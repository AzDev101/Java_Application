
package chapter_10.polymorphism;


public class TestAnimal {
    public static void main(String[] args) {
        
        Dog dog = new Dog();
        dog.name = "Mario";
        dog.age = 2;
        dog.breed = "Chiwawa";
        
        System.out.println("Name of Dog: " +dog.name);
        System.out.println("age of Dog: " +dog.age + "years old");
        System.out.println("Breed of Dog: " +dog.breed);
        dog.sound(5);
        dog.poop();
        
        Cat cat = new Cat();
        cat.sound(2);
        
        Cow cow = new Cow();
        cow.sound(3);
    }
 
}
