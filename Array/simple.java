package Array;
//1--------------largest element in an array
/*public class simple {
 public static void main(String[]args){
     int []arr={1,7,6,5,4,9,3};
     int index=0;
     int lagest=arr[0];
     for(int i=0;i<arr.length-1;i++) {
         if(lagest<arr[i+1]){
             lagest=arr[i+1];
             index=i+1;
         }

     }
     System.out.println("largest element" + lagest + " at index"+index);
 }
}*/
//--2---------- smallest of array----------

/*public class  simple {
    public static void main (String[] args) {
        int[] arr = {1, 3, 5, 7};
        int index = 0;
        int smallest = arr[0];
        for (int i = 0; i < arr.length - 1; i++) {
            if (smallest > arr[i + 1]) {
                smallest = arr[i + 1];
                index = i + 1;
            }
        }
        System.out.println("the smallest " + smallest + " "+"index" + index);
    }
}
*/
//-----3-the second largest element-----
public class simple{
    public static  void main(String[]args){
        int [] arr={1,9,6,8,5,4};
         int largest=arr[0];
       int second=0;
      // int samllest=arr[0];
       int index=0;
       int ind=0;
       for(int i =0;i<arr.length-1;i++){
         if(largest<arr[i+1]) {
             largest=arr[i+1];
             second = arr[i+1-1];
           }
       }
        System.out.println(largest);
      //  System.out.println(second);
    }
}