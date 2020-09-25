package Week2;
import java.util.Scanner;

public class StudentTest {
    public static void main(String[] args) {
        Student sv1 = new Student();
        Student sv2 = new Student("Cuong", "123", "cuongng@gmail.com");
        Student[] students =new Student[100];
        Student sv3 = new Student();
        StudentManagement management = new StudentManagement();
        sv3.setName("Ahihi");
        sv3.setId("124");
        sv3.setGroup("K63CB");
        sv3.setEmail("djsidjs@gmail.com");
        Student sv4 = new Student("Bao", "124", "sdfuefhd@gmail.com");
        management.addStudent(sv1);
        management.addStudent(sv2);
        management.addStudent(sv3);
        management.addStudent(sv4);
        Student sv5 = new Student("Hai", "125", "dfdfdfdfdgdgr@gmail.com");
        management.addStudent(sv5);
        System.out.println(management.studentsByGroup());
        Scanner scanner = new Scanner(System.in);
        String id = scanner.nextLine();
        management.removeStudent(id);
        System.out.println(management.studentsByGroup());
    }
}

