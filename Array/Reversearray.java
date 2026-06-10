package Array;

public class Reversearray {
    // function (from above)
    public static void reverseArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};

        System.out.println("Original Array:");
        for (int n : arr) {
            System.out.print(n + " ");
        }

        reverseArray(arr); // call the function

        System.out.println("\nReversed Array:");
        for (int n : arr) {
            System.out.print(n + " ");
        }
    }
}
