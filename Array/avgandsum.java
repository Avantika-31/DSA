package Array;

public class avgandsum {
    public  static void main(String[]args){
        int []arr={1,7,9,5,4,3};
        int sum =arr[0];
        int avg=0;
        for(int i=1;i<arr.length;i++) {
            sum += arr[i];
            avg=sum/arr.length;
        }
        System.out.println(sum);
        System.out.println(avg);
    }
}
