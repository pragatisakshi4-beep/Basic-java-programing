import java.util.Scanner;

public class NumberRangeAnalyzer {
    public static void main(String[] args) {
        // Read the start and end values
        try (Scanner scanner = new Scanner(System.in)) {
            // Read the start and end values
            int start = scanner.nextInt();
            int end = scanner.nextInt();
            
            int evenSum = 0;
            int oddCount = 0;
            
            // Traverse the range using a single loop
            for (int i = start; i <= end; i++) {
                if (i % 2 == 0) {
                    evenSum += i;   // Add even number to evenSum
                } else {
                    oddCount++;     // Count every odd number
                }
            }
            
            // Print results (adjust format if your platform requires specific labels)
            System.out.println("Even number: " + evenSum);
            System.out.println("Odd number:" +oddCount);
        }
    }
}
