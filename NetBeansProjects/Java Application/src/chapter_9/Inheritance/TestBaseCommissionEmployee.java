
package chapter_9.Inheritance;

public class TestBaseCommissionEmployee {
    public static void main(String[] args) {
        BasePlusCommissionEmployee employee = new BasePlusCommissionEmployee
            ("103334","Udo-Prize","Udo-Kalu",
            "1117-09-6576",10000.0, 0.3,500.0);

        System.out.println("Employee Information");
        System.out.println(employee.toString());

        System.out.printf("%n%s: $%,.2f%n","Earnings",employee.earnings());
    } 
}
