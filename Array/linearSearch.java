package Array;

public class linearSearch {
    public static void main(String[] args) {
        int[]arr={5,3,7,8,9};
        int n=1;
        boolean found=false;
        for(int i =0;i<arr.length;i++) {
            if (arr[i] == n) {
                found = true;
                System.out.println("elemnt found at index " + i);
                break;
            }
        }
            if(!found){
                System.out.println("elemnnt not found");
            }


    }
}
