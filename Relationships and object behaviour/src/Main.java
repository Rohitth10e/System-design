import java.util.ArrayList;
import java.util.List;


// one-one
//class Passport {
//    private String passportNumber;
//    Passport(String passportNumber) {
//        this.passportNumber = passportNumber;
//    }
//
//    public String getPassportNumber() {
//            return passportNumber;
//    }
//}
//
//class Student {
//    private String name;
//    private Passport passport;
//
//    Student(String name, Passport passport){
//        this.name = name;
//        this.passport = passport;
//    }
//
//    public void displayDetails() {
//        System.out.println("Student name: "+ name);
//        System.out.println("Passport number: "+ passport.getPassportNumber());
//    }
//}

// one-many
//class Student {
//    private String name;
//    private String id;
//    Student(String name, String id){
//        this.name = name;
//        this.id = id;
//    }
//    public String getName() {
//        return name;
//    }
//    public String getId() {
//        return id;
//    }
//}
//
//class College {
//    private String name;
//    private List<Student> students;
//    College(String name) {
//        this.name = name;
//        students = new ArrayList<>();
//    }
//    public void addStudent(Student student){
//        students.add(student);
//    }
//    public void printStudents(){
//        for(Student st : students){
//            System.out.println("Name: "+ st.getName() + " id: " + st.getId());
//        }
//    }
//}

// many-many: student enrolled in multiple courses
//class Course{
//    private String name;
//    private List<Student> students;
//    Course(String name){
//        this.name = name;
//        students = new ArrayList<>();
//    }
//}
//class Student {
//    private String name;
//    private List<Course> courses;
//
//    Student(String name){
//        this.name = name;
//        this.courses = new ArrayList<>();
//    }
//}

class Main{
    public static void main(String[] args) {
//        Passport passport = new Passport("246810");
//        Student angshuman = new Student("Angshuman", passport);
//        angshuman.displayDetails();
//        Student s1 = new Student("raj", "1");
//        Student s2 = new Student("raju", "2");
//        College ssit = new College("SSIT");
//        ssit.addStudent(s1);
//        ssit.addStudent(s2);
//        ssit.printStudents();
    }
}