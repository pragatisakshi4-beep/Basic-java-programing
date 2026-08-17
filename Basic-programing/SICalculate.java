public class SICalculate {
    public static void main(String[] args) {

        double principal = 10000.0;
        double rate = 6.5;
        double time = 2.0;

        double weight = 72.0;
        double height = 1.8;

        int m1 = 78, m2 = 84, m3 = 69, m4 = 91, m5 = 88;

        // Simple Interest
        double simpleInterest = principal * rate * time / 100.0;

        // Total Amount
        double totalAmount = principal + simpleInterest;

        // BMI
        double bmi = weight / (height * height);

        // Total Marks
        int totalMarks = m1 + m2 + m3 + m4 + m5;

        // Percentage
        double percentage = totalMarks * 100.0 / 500;

        // Output
        System.out.println("Simple Interest: " + simpleInterest);
        System.out.println("Total Amount: " + totalAmount);
        System.out.println("BMI: " + bmi);
        System.out.println("Total Marks: " + totalMarks);
        System.out.println("Percentage: " + percentage);
    }
}