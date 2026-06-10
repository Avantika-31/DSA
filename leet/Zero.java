package leet;

public class Zero {
    public static void main(String[] args) {
        int []arr={3,7,9,0,8,0};
            int j = 0; // points to position for next non-zero element

            for (int i = 0; i < arr.length; i++) {
                if (arr[i] != 0) {
                    // swap arr[i] with arr[j]
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                    j++;
                }
            }

            // Print result
            for (int n : arr) {
                System.out.print(n + " ");
            }
        }
    }

