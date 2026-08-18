
    import java.util.Scanner;

public class PracticeProgressSummary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read learner's full name
        String fullName = scanner.nextLine();

        // Read number of practice days
        int practiceDays = scanner.nextInt();

        // Loop to read daily solved-problem counts
        int totalSolved = 0;
        for (int i = 0; i < practiceDays; i++) {
            int dailyCount = scanner.nextInt();
            totalSolved += dailyCount;
        }

        // Calculate decimal daily average
        double dailyAverage = (double) totalSolved / practiceDays;

        // Determine Readiness Status
        String status;
        if (dailyAverage >= 5.0) {
            status = "Consistent";
        } else {
            status = "Needs consistency";
        }

        // Exact four-line output format
        System.out.println("Learner: " + fullName);
        System.out.println("Total solved: " + totalSolved);
        System.out.println("Daily average: " + dailyAverage);
        System.out.print("Status: " + status);

        scanner.close();
    }
}

