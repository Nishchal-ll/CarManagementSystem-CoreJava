import Student.StudentManagement;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        StudentManagement manager = new StudentManagement();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("===== Student Management System =====");
            System.out.println("1. Add Student");
            System.out.println("2. View Students");
            System.out.println("3. Update Student");
            System.out.println("4. Delete Student");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");

            int choice = sc.nextInt();

            switch (choice) {
                case 1 -> manager.AddStudent();
                case 2 -> manager.ViewStudents();
                case 3 -> manager.updateStudents();
                case 4 -> manager.deleteStudent();
                case 5 -> {
                    System.out.println("Exiting program...");
                    System.exit(0);
                }
                default -> System.out.println("Invalid choice! Try again.\n");
            }
        }
    }
}
