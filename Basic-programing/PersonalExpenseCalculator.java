
    import java.util.Scanner;

public class PersonalExpenseCalculator {
    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {
            // Input
            double monthlyIncome = sc.nextDouble();
            double rentExpense = sc.nextDouble();
            double foodExpense = sc.nextDouble();
            double travelExpense = sc.nextDouble();

            // Calculate total expense
            double totalExpense = rentExpense + foodExpense + travelExpense;

            // Calculate remaining amount
            double remainingAmount = monthlyIncome - totalExpense;

            // Determine budget status
            String status;

            if (remainingAmount >= 0) {
                status = "Within budget";
            } else {
                status = "Over budget";
            }

            // Output
            System.out.println("Total expense: " + totalExpense);
            System.out.println("Remaining: " + remainingAmount);
            System.out.println("Status: " + status);
        }
    }
}

