public class Student {
    String firstNname;
    int ageInt;
    String ageStr;
    
    //gdy wiek to initger
    public Student(String fname, int age){
        firstNname = fname;
        ageInt = age;
    }
    
    //gdy wiek to string
    public Student(String fname, String age){
        firstNname = fname;
        ageStr = age;
    }
    
     public static void main(String[] args){
         Student student1 = new Student("Rafal", 20);
         Student student2 = new Student("Pawel", "21");
         
         System.out.println("Student 1: " + student1.firstNname + " " + student1.ageInt + "yo");
         System.out.println("Student 2: " + student2.firstNname + " " + student2.ageStr + "yo");
      
     }
}
