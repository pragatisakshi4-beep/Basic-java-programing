public class Ifelsestatement {
    public static void main(String[] args) {

        int number = 24;

        if (number > 0) {
            System.out.println("The number is Positive");
        } else {
            System.out.println("The number is Not Positive");
        }

        if (number < 0) {
            System.out.println("The number is Negative");
        } else {
            System.out.println("The number is Not Negative");
        }

        if (number == 0) {
            System.out.println("The number is Zero");
        } else {
            System.out.println("The number is Not Zero");
        }

        if (number % 2 == 0) {
            System.out.println("The number is Even");
        } else {
            System.out.println("The number is Odd");
        }
    }
}