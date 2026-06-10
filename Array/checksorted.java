package Array;

public class checksorted {
    public static void main(String[] args) {
        int [] arr={1,4,54,65,7,84};
        boolean sort= true;
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]>arr[i+1]){//is any elemt is bigger
                sort =false;
                System.out.println("array is not  sorted");
                break;
            }
        }
        if(sort){
            System.out.println("array  sorted");
        }
    }
}
