import java.util.Scanner;

public class Array3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 1. Read the array size
        int size = sc.nextInt();

        // 2. Read and store array elements
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        // 3. Read the target value to count
        int target = sc.nextInt();

        // 4. Count occurrences using exactly one loop and one equality check
        int count = 0;
        for (int i = 0; i < size; i++) {
            if (arr[i] == target) {
                count++;
            }
        }

        // 5. Display the final output matching the exact format required
        System.out.println("Frequency of " + target + ": " + count);

        sc.close();
    }
}