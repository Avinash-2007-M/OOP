package Practical;

class Person {
    void displayInfo() {
        System.out.println("General person information.");
    }
}

class Student extends Person {
    String studentID = "S1234";
    
    void showStudentID() {
        System.out.println("Student ID: " + studentID);
    }
}

class GraduateStudent extends Student {
    void submitThesis() {
        System.out.println("Thesis submitted.");
    }
}

public class MultiLevelInheritance2 {
    public static void main(String[] args) {
        GraduateStudent gs = new GraduateStudent();
        gs.displayInfo();    // From Person
        gs.showStudentID();  // From Student
        gs.submitThesis();   // From GraduateStudent
    }
}
