public class Maina {
    public static void main(String[] args) {

        int[] original = {14, 18, 22, 26};
        int updateIndex = 1;
        int updatedValue = 25;
        int requestedIndex = 4;

        // Create an independent snapshot
        int[] snapshot = new int[original.length];
        System.arraycopy(original, 0, snapshot, 0, original.length);

        // Create a live-view alias
        int[] liveView = original;

        // Update only when updateIndex is valid
        if (updateIndex >= 0 && updateIndex < original.length) {
            liveView[updateIndex] = updatedValue;
        }

        // Print original working state
        System.out.print("Original: ");
        for (int i = 0; i < original.length; i++) {
            System.out.print(original[i] + " ");
        }
        System.out.println();

        // Print independent snapshot
        System.out.print("Snapshot: ");
        for (int i = 0; i < snapshot.length; i++) {
            System.out.print(snapshot[i] + " ");
        }
        System.out.println();

        // Check if both references point to the same array
        System.out.println("Same object: " + (original == liveView));

        // Check requested index before accessing the array
        if (requestedIndex >= 0 && requestedIndex < original.length) {
            System.out.println("Requested value: " + original[requestedIndex]);
        } else {
            System.out.println("Requested value: Invalid index");
        }
    }
}