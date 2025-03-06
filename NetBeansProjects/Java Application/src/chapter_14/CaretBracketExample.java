
package chapter_14;
import java.util.regex.*;

public class CaretBracketExample {
    public static void main(String[] args) {
      String text = "Cat bat mat cut cot\n";
      String pat = "cot\\z";
      
      Pattern pattern = Pattern.compile(pat);
      Matcher matcher = pattern.matcher(text);
      
      while(matcher.find()){
            System.out.println(matcher.group());
        }
    }
  
}
