package leet;

public class removeElement {
    public static int removing(int[]arr,int val){
        int j=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=val){
                arr[j++]=arr[i];
            }

        }
        return j;
    }
    public static void main(String[] args) {
        int []arr={2,9,8,4,6,3,4};
        int val=6;
       int length= removing(arr,val);
        for(int i=0;i<length;i++){
            System.out.println(arr[i]);
        }
    }
}
