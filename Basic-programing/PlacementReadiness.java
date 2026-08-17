public class PlacementReadiness {
    public static void main(String[] args) {

        int marks = 68;
        int attendance = 80;
        int practiceDays = 3;

        if (marks >= 60 && attendance >= 75) {
            System.out.println("Placement Ready");
        } else {
            System.out.println("Placement Not Ready");
        }

        for (int day = 1; day <= practiceDays; day++) {
            System.out.println("Practice Day: " + day);
        }
    }
}
