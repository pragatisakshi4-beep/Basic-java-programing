import java.util.Scanner;

class MethodDemo {

    // Method 1: No input, no return
    public void sayHello() {
        System.out.println("Hello from a method!");
    }

    // Method 2: Input, no return
    public void greet(String name) {
        System.out.println("Hello, " + name + "!");
    }

    // Method 3: No input, returns int
    public int getLuckyNumber() {
        return 7;
    }

    // Method 4: Input, returns int
    public int add(int a, int b) {
        return a + b;
    }
}

public class Main6 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Read name and two numbers
        String name = scanner.next();
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();

        // Create one object
        MethodDemo demo = new MethodDemo();

        // Call all four methods
        demo.sayHello();

        demo.greet(name);

        int luckyNumber = demo.getLuckyNumber();
        System.out.println("Lucky Number: " + luckyNumber);

        int sum = demo.add(num1, num2);
        System.out.println("Sum: " + sum);
    }
}