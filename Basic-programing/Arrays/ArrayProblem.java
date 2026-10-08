public class ArrayProblem {

    static int getMaximum(int arr[]) {
        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("Array must not be empty or null");
        }
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int arr[] = {7, 2, 6, 8, 19};
        System.out.println(getMaximum(arr));
    }
}
