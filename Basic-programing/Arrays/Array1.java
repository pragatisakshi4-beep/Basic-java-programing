
    import java.util.Scanner; // Add this line here

public class Array1 {
    public static void main(String[] args) {
        // Write your code here.
        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[5];
        int total = 0;
        
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = sc.nextInt();
        }
        
        // Don't forget your second loop to calculate the total!
        for (int i = 0; i < numbers.length; i++) {
            total = total + numbers[i];
        }
        
        System.out.println("Total: " + total);
    }
}

