
package chapter_14;


public class StingsExample {
    public static void main(String[] args) {
        // The different string constructors/Methods.
        String name = "John";        
       
        String color = new String("black");
        System.out.println(color);
        
        String copy = new String(name);
        System.out.println(copy);
        
        char[] letter = {'J','a','v','a'};
        String myletters = new String(letter);
        System.out.println(myletters);
        
        System.out.println(name.length());
        System.out.println(name.charAt(3));
        
        String str = "Programming";
        String str1 = "Java Programming";
        System.out.println(str.substring(3));
        System.out.println(str1.substring(5,16));
        
        String str3 = "I love Java!";
        System.out.println(str3.indexOf("Java"));
        
        String str4 = "banana";
        System.out.println(str4.replace('a','o'));
        
        String sentence = "Java is Fun";
        String[] words = sentence.split(" ");
        
        for(String word : words){
            System.out.println(word);
        }
    }
}
