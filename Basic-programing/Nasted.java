public class Nasted {
    public static void main(String[] args) {

        String studentName = "Pragati";

        int marks = 78;
        int attendance = 82;
        int assignmentMarks = 75;
        int interviewScore = 72;

        boolean projectCompleted = true;

        System.out.println("===== STUDENT PERFORMANCE REPORT =====");
        System.out.println("Student Name: " + studentName);
        System.out.println("Marks: " + marks);
        System.out.println("Attendance: " + attendance + "%");
        System.out.println("Assignment Marks: " + assignmentMarks);
        System.out.println("Interview Score: " + interviewScore);
        System.out.println("Project Completed: " + projectCompleted);

        // First Decision: Check Academic Result
        if (marks >= 40) {

            System.out.println("\nAcademic Result: PASS");

            // Nested if: Check Attendance
            if (attendance >= 75) {

                System.out.println("Attendance: Eligible");

                // Nested if: Check Assignment
                if (assignmentMarks >= 50) {

                    System.out.println("Assignment: Completed");

                    // Nested if: Check Project
                    if (projectCompleted) {

                        System.out.println("Project: Completed");

                        // Nested if: Check Interview
                        if (interviewScore >= 70) {
                            System.out.println("Interview: Passed");
                            System.out.println("Final Status: PLACEMENT READY");
                        } 
                        else {
                            System.out.println("Interview: Needs Improvement");
                        }

                    } 
                    else {
                        System.out.println("Project: Not Completed");
                    }

                } 
                else {
                    System.out.println("Assignment: Marks are Low");
                }

            } 
            else {
                System.out.println("Attendance: Not Eligible");
            }

        } 
        else {
            System.out.println("Academic Result: FAIL");
            System.out.println("Final Status: Improve Academic Performance");
        }

        System.out.println("======================================");
    }
}

