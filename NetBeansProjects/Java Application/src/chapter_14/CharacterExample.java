
package chapter_14;


public class CharacterExample {
    public static void main(String[] args) {
       char ch = 'a' + 1;
       //int num = ch;
       /*int num = 65;
       char mychar = (char)num; //type casting
       System.out.println(mychar);*/
       
       /*int x = 50;
       byte num = 20;
       Character.isLetter(ch);
       System.out.println(Integer.toString(x));*/
       
       char ch1 = '&';
       char ch2 = '9';
       char ch3 = 'r';
       
       
       System.out.println(Character.isLetter(ch1));
       System.out.println(Character.isDigit(ch2));
       System.out.println(Character.toUpperCase(ch3));
    } 
}
