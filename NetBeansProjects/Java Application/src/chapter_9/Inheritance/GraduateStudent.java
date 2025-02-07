
package chapter_9.Inheritance;


public class GraduateStudent extends Student{
    String researchTopic;
    
    public GraduateStudent(String studentId, String name, int age, String gender,String researchTopic){
        super(studentId, name, age, gender);
        this.researchTopic = researchTopic;
    } 
    
    public void conductResearch(){
        System.out.printf("%s is cnducting a research on %s%n ",name, researchTopic);
    }
    @Override public void display(){
        super.display();
        System.out.printf("Research Topic: %s%n",researchTopic);
    }
}
