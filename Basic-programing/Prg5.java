import java.util.Scanner;

public class Prg5 {

    static class Student {

        // Instance variable
        String name;

        // Set the name
        void setName(String name) {
            this.name = name;
        }

        // Display the stored name
        void displayName() {
            System.out.println("Student Name: " + name);
        }
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Read the student's name
        String name = scanner.nextLine();

        // Create one Student object
        Student student = new Student();

        // Call setName()
        student.setName(name);

        // Call displayName()
        student.displayName();

        scanner.close();
    }
}
