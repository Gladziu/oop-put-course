class Student {
        String first_name;
        String last_name;
        int age;
    }
    
class Mouse {
        String colour;
        String company;
    } 

class Keyboard {
        String colour;
        String company;
    }
    
public class Test{
    public static void main(String[] args)  
    { 
        Student student = new Student(); 
        student.first_name = "Jan";
        student.last_name = "Kowalski";
        student.age = 20;
        
        Mouse mouse = new Mouse();
        mouse.colour = "black";
        
        System.out.println(student.first_name);
      
    } 
}
