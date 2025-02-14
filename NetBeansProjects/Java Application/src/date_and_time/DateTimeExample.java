
package date_and_time;
import java.time.LocalDateTime;
import java.time.Month;

public class DateTimeExample {
    public static void main(String[] args) {
        LocalDateTime todaysDateTime = LocalDateTime.now();
        System.out.printf("%s%n", todaysDateTime);
        
        LocalDateTime appointmentDateTime = LocalDateTime.of(2025, Month.MARCH, 12, 12, 30);
        System.out.printf("%s%n", appointmentDateTime);
        
        String userDateTime = "2014-09-12";
        System.out.printf("%s%n",userDateTime);
    }
}
