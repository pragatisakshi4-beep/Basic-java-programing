public class WhileLoop {
    public static void main(String[] args) {

        int marks = 85;
        int total = 0;
        int count = 0;
        int passCount = 0;
        int failCount = 0;

        System.out.println("===== STUDENT MARKS ANALYSIS =====");

        while (count < 5) {

            System.out.println("Checking subject " + (count + 1));

            total = total + marks;

            if (marks >= 40) {
                passCount++;
                System.out.println("Result: Pass");
            } 
            else {
                failCount++;
                System.out.println("Result: Fail");
            }

            count++;
        }

        double average = (double) total / 5;

        System.out.println("-------------------------------");
        System.out.println("Total Marks     : " + total);
        System.out.println("Average Marks   : " + average);
        System.out.println("Passed Subjects : " + passCount);
        System.out.println("Failed Subjects : " + failCount);

        if (failCount == 0) {

            System.out.println("Final Result: PASS");

            if (average >= 75) {
                System.out.println("Performance: Excellent");
            }
            else if (average >= 60) {
                System.out.println("Performance: Very Good");
            }
            else {
                System.out.println("Performance: Good");
            }

        }
        else {
            System.out.println("Final Result: FAIL");
            System.out.println("Performance: Need Improvement");
        }

        System.out.println("===============================");
    }
}
