public class ifstatement {
    public static void main(String[] args) {

        int number = -7;
        int firstScore = 18;
        int secondScore = 25;

        if (number > 0) {
            System.out.println("Positive");
        }

        if (number < 0) {
            System.out.println("Negative");
        }

        if (number == 0) {
            System.out.println("Zero");
        }

        if (firstScore > secondScore) {
            System.out.println("First score is higher");
        }

        if (firstScore < secondScore) {
            System.out.println("Second score is higher");
        }

        if (firstScore == secondScore) {
            System.out.println("Both scores are equal");
        }
    }
}

