package leet;
public class rotate{
    static void reverse(int arr[],int start,int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[]args){
        int arr[]={1,4,5,6,7,8,9};
        int d=3;
        int n = arr.length;
        d=d%n;
       /* reverse(arr,0,d-1);//left rotate
        reverse(arr,d,n-1);
        reverse(arr,0,n-1);*/
        reverse(arr,0,n-1);
        reverse(arr,d,n-1);
        reverse(arr,0,n-1);
        System.out.println("roated array");
        for (int nu:arr){
            System.out.println(nu);
        }
    }
}
