package Array;

public class frequencty {
        public static void main(String[] args) {
            int[] arr = {10, 20, 10, 30, 20, 10};
            boolean[] visited = new boolean[arr.length]; // to mark counted elements

            for (int i = 0; i < arr.length; i++) {
                if (visited[i]) continue; // skip already counted elements

                int count = 1; // current element count
                for (int j = i + 1; j < arr.length; j++) {
                    if (arr[i] == arr[j]) {
                        count++;
                        visited[j] = true; // mark as counted
                    }
                }
                System.out.println(arr[i] + " occurs " + count + " times");
            }
        }
    }

