public class Main {
    public static void main(String[] args) {

        int day = 6;

        switch (day) {
            case 1, 2, 3, 4, 5 -> System.out.println("Learning Day");
            case 6, 7 -> System.out.println("Revision Day");
            default -> System.out.println("Invalid Day");
        }
    }
}
