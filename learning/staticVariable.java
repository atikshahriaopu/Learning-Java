package learning;

class School{
    static String schoolName;
}
class Student extends School{
    String name;
    public void printInfo(){
        System.out.println("Student name: " + this.name);
        System.out.println("School name: " + this.schoolName);
    }
}

public class staticVariable {
    public static void main(String[] args) {
        School.schoolName = "ITSC";

        Student s = new Student();
        s.name = "Sakib";
        s.printInfo();
    }
}
