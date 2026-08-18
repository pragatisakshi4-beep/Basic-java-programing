public class Switch {
    public static void main(String[] args) {

        char grade = 'A';

        switch (grade) {
            case 'A' -> {
                System.out.println("Grade: A");
                System.out.println("Performance: Excellent");
                System.out.println("Keep it up!");
            }
            case 'B' -> {
                System.out.println("Grade: B");
                System.out.println("Performance: Very Good");
                System.out.println("Good work!");
            }
            case 'C' -> {
                System.out.println("Grade: C");
                System.out.println("Performance: Good");
                System.out.println("Need some improvement.");
            }
            case 'D' -> {
                System.out.println("Grade: D");
                System.out.println("Performance: Average");
                System.out.println("Work harder.");
            }
            case 'F' -> {
                System.out.println("Grade: F");
                System.out.println("Result: Fail");
                System.out.println("Improve your performance.");
            }
            default -> System.out.println("Invalid Grade");
        }
    }
}

