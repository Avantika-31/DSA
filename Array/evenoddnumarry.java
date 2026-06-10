package Array;

public class evenoddnumarry {
    public static void main(String[] args) {
        int []arr={2,4,6,7,8,9};
        int even;
      //int evencount;
        //int oddcount; // to count the number of odd present
       //int odd;
      for(int num:arr){
          if(num%2==0){
              System.out.println("even"+num);

          }
        }
        for(int num:arr){
            if(num%2!=0){
                System.out.println("odd"+num);



            }
        }

    }
}
