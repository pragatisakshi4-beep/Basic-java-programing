
import java.util.Scanner;

public class Main2 {
    static class Student {
        int id;
        String name;
        String course;
        double javaScore;

        public Student(int id, String name, String course, double javaScore) {
            this.id = id;
            this.name = name;
            this.course = course;
            this.javaScore = javaScore;
        }

        public void displayDetails() {
            System.out.println("ID: " + id);
            System.out.println("Name: " + name);
            System.out.println("Course: " + course);
            System.out.println("JavaScore: " + javaScore);
        }
    }
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int id = scanner.nextInt();
            scanner.nextLine();
            
            String name = scanner.nextLine();
            String course = scanner.nextLine();
            double javaScore = scanner.nextDouble();
            
            Student student = new Student(id, name, course, javaScore);
            student.displayDetails();
        }
    }
}

