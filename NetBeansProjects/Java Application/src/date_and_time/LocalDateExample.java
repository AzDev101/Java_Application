
package date_and_time;
import java.time.LocalDate;
import java.time.Month;

public class LocalDateExample {
    public static void main(String[] args) {
        //the now function gets the current date(without time)
        LocalDate todayDate = LocalDate.now();
        System.out.println(todayDate);
        
        //of method ceates a local date from the given month and date
        LocalDate date = LocalDate.of(2025, 2, 16);
        System.out.println(date);
        
        //parse method parses a string representing a date in ISO-8601 format
        String dOB = "2000-06-20";
        LocalDate birthDate = LocalDate.parse(dOB);
        System.out.println(birthDate);
        
        //getYear function returns the current year
        int birthYear = LocalDate.parse(dOB).getYear();
        System.out.printf("Your birth year is %d%n",birthYear);
        
        //getYear function returns the current month
        Month birthMonth = LocalDate.parse(dOB).getMonth();
        System.out.printf("Your birth month is %s%n",birthMonth);
        
        //getYear function returns the current day
        int birthday = LocalDate.parse(dOB).getDayOfMonth();
        System.out.printf("Your birth day is %d%n",birthday);
        
        //Adds a specified number of days
        LocalDate addDate = todayDate.plusDays(5);
        System.out.printf("Number of days was increased %s%n", addDate);
        
        //checks wether the year is a leap year
        boolean checkDate = birthDate.isLeapYear();
        System.out.printf("%b%n",checkDate);
        
        //Checks if two(2) dates are equal
        String birthDay1 = "2013-09-17";
        String birthDay2 = "2015-09-17";
        LocalDate date1 = LocalDate.parse(birthDay1);
        LocalDate date2 = LocalDate.parse(birthDay2);
        
        boolean isEqual = date1.equals(date2);
        System.out.printf("Are the dates equal? %b%n",isEqual);
    }
}
