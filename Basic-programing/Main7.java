import java.util.Scanner;

class StudentUtility {

    // 1. Print report title
    void showReportTitle() {
        System.out.println("Student Performance Report");
    }

    // 2. Display student information
    void displayStudent(int id, String name) {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
    }

    // 3. Return passing percentage
    double getPassingPercentage() {
        return 60.0;
    }

    // 4. Calculate average percentage
    double calculatePercentage(int javaScore, int sqlScore) {
        return (javaScore + sqlScore) / 2.0;
    }
}

public class Main7 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Create one object
        StudentUtility utility = new StudentUtility();

        // Read input
        int id = scanner.nextInt();
        scanner.nextLine();

        String name = scanner.nextLine();

        int javaScore = scanner.nextInt();
        int sqlScore = scanner.nextInt();

        // Call methods
        utility.showReportTitle();

        utility.displayStudent(id, name);

        double percentage =
                utility.calculatePercentage(javaScore, sqlScore);

        double passingPercentage =
                utility.getPassingPercentage();

        System.out.println("Percentage: " + percentage);

        // Final decision
        if (percentage >= passingPercentage) {
            System.out.println("Result: PASS");
        } else {
            System.out.println("Result: NEEDS IMPROVEMENT");
        }

        scanner.close();
    }
}
