import java.sql.Connection;

public class Main {
    public static void main(String[] args) {
        StudentDAO dao = new StudentDAO();

        Student student = new Student(
            "Micheal",
            "Emeka",
            "Male", 
            24,
            "Michealemeka@gmail.com"
        );
        boolean result = dao.addStudent(student);
        if (result) {
            System.out.println("Student added successfully.");
        } else {
            System.out.println("Failed to add student.");
        }
        System.out.println("Name: " + student.getFirst_name() + " " + student.getLast_name());
        System.out.println("Gender: " + student.getGender());
        System.out.println("Age: " + student.getAge());
        System.out.println("Email: " + student.getEmail());
        
        dao.addStudent(student);
    }
}