package leet;
import java.util.Scanner;
public class pow {
  public static void main(String[]args){
     Scanner src = new Scanner(System.in);
      System.out.println("enter the number you want to check");
    int n = src.nextInt();
            boolean str=false;
            for(int i=0;Math.pow(3,i)<=n;i++){
                if(n==(int)Math.pow(3, i)){
                    System.out.println("is the power of 3");
                 str = true;
                }

            }
      System.out.println(str);

        }
    }


