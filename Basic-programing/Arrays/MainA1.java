public class MainA1 {
    public static void main(String[] args) {
        // Step 1: Initialize data structures in memory
        int[] values = {10, 20, 30, 40, 50};
        int bonus = 5;

        // Step 2 & 3: Iterate and modify elements in place
        for (int i = 0; i < values.length; i++) {
            // Replaces the value at index 'i' with its new boosted value
            values[i] = values[i] + bonus; 
        }

        // Step 4: Format and display output
        System.out.print("Updated values: ");
        for (int i = 0; i < values.length; i++) {
            // Prints each number followed by a space on the same line
            System.out.print(values[i] + " "); 
        }
    }
}

