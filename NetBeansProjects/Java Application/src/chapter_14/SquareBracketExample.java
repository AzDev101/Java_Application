
package chapter_14;

import java.util.regex.*;



public class SquareBracketExample {
    public static void main(String[] args) {
        String text = "Cat bat mat cut cot";
        String pat = "[cmb]at";
        
        Pattern pattern = Pattern.compile(pat);
        Matcher matcher = pattern.matcher(text);
        
        while(matcher.find()){
            System.out.println(matcher.find());
        }
    }
  
}
