package leet;
import java.util.Scanner;
public class adddigit {
    public static int adddigi(int num){
        if(num<10){
            return num;
        }
        int sum=0;
        while(num>0){
            sum+=num%10;
            num/=10;
        }
        return adddigi(sum);

    }
    public static void main(String[]args){
        Scanner src=new Scanner(System.in);
        System.out.println("enter the number uou want to be single digit");
        int num= src.nextInt();
        System.out.println( "single digit"+adddigi(num));
    }
}
