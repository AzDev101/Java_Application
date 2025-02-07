
package composition;

public class ManyToManyAssociation{
    public static void main(String[] args) {
        // Creating courses
       Course java = new Course("Java");
       Course python = new Course("Python");
       Course logic = new Course("Logic");
       Course sql = new Course("SQL");

        // Creating students
        Student student1 = new Student("Alice");
        Student student2 = new Student("Bob");

        // Enrolling students in courses
        student1.enroll(java);
        student1.enroll(python);

        // Displaying enrolled courses for student1
        System.out.println(student1.name + " enrolled in: ");
        for (Course c : student1.courses) {
            System.out.println("- " + c.courseName);
        }

        // Displaying students enrolled in Java course
        System.out.println("Students enrolled in Java:");
        for (Course c : student1.courses) {
            System.out.println("- " + c.courseName);
        }
        
        System.out.println("Students enrolled in Java:");
        for (Student s : java.students) {
            System.out.println("- " + s.name);
        }
    }
}
