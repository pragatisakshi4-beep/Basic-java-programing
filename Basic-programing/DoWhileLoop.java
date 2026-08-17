public class DoWhileLoop {
    public static void main(String[] args) {

        int i = 1;
        int sum = 0;
        int evenCount = 0;
        int oddCount = 0;

        do {

            System.out.println("Number: " + i);

            // Calculate sum
            sum = sum + i;

            // Check even or odd
            if (i % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }

            i++;

        } while (i <= 10);

        System.out.println("----------------------");
        System.out.println("Total Sum   : " + sum);
        System.out.println("Even Numbers: " + evenCount);
        System.out.println("Odd Numbers : " + oddCount);
    }
}
