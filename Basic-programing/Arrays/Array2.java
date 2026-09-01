import java.util.Scanner;

public class Array2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. Read array size
        int size = scanner.nextInt();

        // 2. Initialize the array and read its elements
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }

        // 3. Read the target value
        int target = scanner.nextInt();

        // 4. Perform linear search and stop after the first match
        boolean isPresent = false;
        for (int i = 0; i < size; i++) {
            if (arr[i] == target) {
                isPresent = true;
                break; // Stop search immediately
            }
        }

        // 5. Print search result status
        if (isPresent) {
            System.out.println("Found");
        } else {
            System.out.println("Not Found");
        }

        // 6. Print the array in reverse order without modifying the original array
        System.out.print("Reverse order: ");
        for (int i = size - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        scanner.close();
    }
}
