
    import java.util.Scanner;

public class CL {
    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)) {
            int days = scanner.nextInt();
            int total = 0;
            
            for (int i = 0; i < days; i++) {
                int solved = scanner.nextInt();
                total = total + solved;
            }
            
            String status;
            
            if (total >= 20) {
                status = "Strong progress";
            } else if (total >= 10) {
                status = "Keep improving";
            } else {
                status = "Needs more practice";
            }
            
            System.out.println("Total solved: " + total);
            System.out.println("Status: " + status);
        }
    }
}

