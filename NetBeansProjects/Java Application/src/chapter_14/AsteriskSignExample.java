
package chapter_14;
import java.util.regex.*;

public class AsteriskSignExample {
    public static void main(String[] args) {
      String text = "atabgabagbba";
      String pat = "ab*";
      
      Pattern pattern = Pattern.compile(pat);
      Matcher matcher = pattern.matcher(text);
      
      while(matcher.find()){
            System.out.println(matcher.group());
        }
    }
 
}
