public class ArrayShuffle {

    public static void main(String[] args) {
        int arr[] = { 1, 5, 6, 7, 10 };
        System.out.println("Displaying the array elements before shuffle:");
        printArray(arr);
        shuffle(arr);
        System.out.println("Displaying the array elements after shuffle:");
        printArray(arr);

    }

    // This method will perform shuffle operation inside the array
    public static void shuffle(int arr[]) {
        int temp;
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            int r = i + (int) (Math.random() * (n - i));
            temp = arr[r];
            arr[r] = arr[i];
            arr[i] = temp;
        }

    }

    // This method will display the array elements
    private static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

    }

}