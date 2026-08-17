public class IfelseIfstatement {
    public static void main(String[] args) {

        String studentName = "Pragati";

        int marks = 85;
        int attendance = 82;

        System.out.println("===== STUDENT RESULT =====");
        System.out.println("Student Name: " + studentName);
        System.out.println("Marks: " + marks);
        System.out.println("Attendance: " + attendance + "%");

        // Grade calculation
        if (marks >= 90) {
            System.out.println("Grade: A+");
            System.out.println("Performance: Excellent");
        }
        else if (marks >= 75) {
            System.out.println("Grade: A");
            System.out.println("Performance: Very Good");
        }
        else if (marks >= 60) {
            System.out.println("Grade: B");
            System.out.println("Performance: Good");
        }
        else if (marks >= 40) {
            System.out.println("Grade: C");
            System.out.println("Performance: Average");
        }
        else {
            System.out.println("Grade: F");
            System.out.println("Performance: Poor");
        }

        // Attendance status
        if (attendance >= 75) {
            System.out.println("Attendance Status: Eligible");
        }
        else if (attendance >= 60) {
            System.out.println("Attendance Status: Warning");
        }
        else {
            System.out.println("Attendance Status: Not Eligible");
        }

        // Final result
        if (marks >= 40) {
            System.out.println("Result: PASS");
        }
        else {
            System.out.println("Result: FAIL");
        }

        System.out.println("==========================");
    }
}

