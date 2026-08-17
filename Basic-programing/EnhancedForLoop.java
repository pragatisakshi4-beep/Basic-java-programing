public class EnhancedForLoop {
    public static void main(String[] args) {

        int[] marks = {85, 72, 90, 65, 78};

        int total = 0;
        int highest = marks[0];
        int lowest = marks[0];
        int passCount = 0;

        for (int mark : marks) {

            System.out.println("Marks: " + mark);

            // Calculate total
            total = total + mark;

            // Find highest
            if (mark > highest) {
                highest = mark;
            }

            // Find lowest
            if (mark < lowest) {
                lowest = mark;
            }

            // Check pass
            if (mark >= 40) {
                passCount++;
            }
        }

        double average = (double) total / marks.length;

        System.out.println("-------------------------");
        System.out.println("Total Marks    : " + total);
        System.out.println("Average Marks  : " + average);
        System.out.println("Highest Marks  : " + highest);
        System.out.println("Lowest Marks   : " + lowest);
        System.out.println("Passed Subjects: " + passCount);
    }
}
