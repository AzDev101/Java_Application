
package date_and_time;
import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;

public class DateTimeFormatterExample {
    public static void main(String[] args) {
       DateTimeFormatter formatter = DateTimeFormatter.ofPattern("DD/MM/YYYY HH:mm:ss");
       
       String formattedDate = LocalDateTime.now().format(formatter);
       System.out.println(formattedDate);
               
     }
 
}
