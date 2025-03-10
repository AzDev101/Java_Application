
package chapter_9.Inheritance;

public class Employee {
   private final String employeeId;
   private String firstName; 
   private String lastName;
   private final String socialSecurityNumber;
   
   //Parameterised Constructor to initialise the above variables.
   public Employee(String employeeId, String firstName, String lastName, String socialSecurityNumber){
     this.employeeId = employeeId;
     this.firstName = firstName;
     this.lastName = lastName;
     this.socialSecurityNumber = socialSecurityNumber;
   }
   //get and set method for the variables
   public String getEmployeeId(){
    return employeeId;
   }
   
   public String getFirstName(){
    return firstName;
   }
   
   public void setFirstName(String firstName){
    this.firstName = firstName;
   }
   
    public String getLastName(){
    return lastName;
   }
   
   public void setLastName(String lastName){
    this.lastName = lastName;
   }
   
    public String getSocialSecurityNumber(){
        return socialSecurityNumber;
   }
   @Override public String toString(){
      return String.format("%-15s: %-25s%n%-15s: %-25s%n%-15s: %-25s","Employee Details", 
      employeeId,"Full Name", firstName + " " + lastName, "Social Security Number", socialSecurityNumber);
   }
}
