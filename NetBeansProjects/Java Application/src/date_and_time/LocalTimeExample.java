
package date_and_time;
import java.time.LocalTime;

public class LocalTimeExample {
    public static void main(String[] args) {
        //Prints the currennt time of the laptop
        LocalTime todaysTime = LocalTime.now();
        System.out.println(todaysTime);
        
        //Prints a specified time(Hour, Minute, Seconds and Nanoseconds)
        LocalTime appointmentTime = LocalTime.of(1, 30,38, 
        3337);
        System.out.println(appointmentTime);
        
        //Parses a string representing a time in ISO 8601 format
        LocalTime userTime = LocalTime.parse("14:30:45");
        System.out.println(userTime);
        
        //gets the hour value
        int hour = userTime.getHour();
        System.out.println(hour);
        
         //gets the minutes value
        int minutes = userTime.getMinute();
        System.out.println(minutes);
        
         //gets the seconds value
        int seconds = userTime.getSecond();
        System.out.println(seconds);
        
        //Adds a specific amount of the time to the already given one
        LocalTime addHours = userTime.plusHours(2);
        System.out.println(addHours);
        
        boolean isBefore = LocalTime.now().isBefore(LocalTime.of(12,0));
        System.out.println(isBefore);
        
        boolean isAfter = LocalTime.now().isAfter(LocalTime.of(12,0));
        System.out.println(isAfter);
        
        String meetingTime1 = "04:30:56";
        String meetingTime2 = "07:30:56";
        
        LocalTime time1 = LocalTime.parse(meetingTime1);
        LocalTime time2 = LocalTime.parse(meetingTime2);
        
        boolean isTimeEqual = time1.equals(time2);
        System.out.println(isTimeEqual);
        
    }
}
