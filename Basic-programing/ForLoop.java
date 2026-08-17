public class ForLoop {
    public static void main(String[] args) {

        String[] subjects = {
            "Java",
            "DSA",
            "Database",
            "Computer Network",
            "Operating System"
        };

        int[] marks = {
            85,
            78,
            72,
            65,
            80
        };

        int total = 0;
        int highest = marks[0];
        int lowest = marks[0];
        int passCount = 0;
        int failCount = 0;

        System.out.println("===== STUDENT MARKS REPORT =====");

        // Print subjects and marks
        for (int i = 0; i < marks.length; i++) {

            System.out.println(
                subjects[i] + " : " + marks[i]
            );

            // Calculate total
            total = total + marks[i];

            // Find highest marks
            if (marks[i] > highest) {
                highest = marks[i];
            }

            // Find lowest marks
            if (marks[i] < lowest) {
                lowest = marks[i];
            }

            // Check pass/fail
            if (marks[i] >= 40) {
                passCount++;
            } else {
                failCount++;
            }
        }

        double average = (double) total / marks.length;
        double percentage = (double) total / (marks.length * 100) * 100;

        System.out.println("-------------------------------");
        System.out.println("Total Marks      : " + total);
        System.out.println("Average Marks    : " + average);
        System.out.println("Percentage       : " + percentage + "%");
        System.out.println("Highest Marks    : " + highest);
        System.out.println("Lowest Marks     : " + lowest);
        System.out.println("Passed Subjects  : " + passCount);
        System.out.println("Failed Subjects  : " + failCount);

        // Final result
        if (failCount == 0) {
            System.out.println("Final Result     : PASS");
        } else {
            System.out.println("Final Result     : FAIL");
        }

        System.out.println("===============================");
    }
}
