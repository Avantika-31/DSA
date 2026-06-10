package leet;
import java.util.Scanner;
public class nineBottle {
    public static int ninebottles(int bottle,int exchange){
        int n=bottle;
        int drank = bottle;
        while(n>=exchange){
            int newbottle=n/exchange;
            int left= n %exchange;
            drank+=newbottle;
            n=newbottle+left;
        }
        return drank;

}
public static void main(String[]args){
    Scanner src=new Scanner(System.in);
    System.out.println("enter the number of bottles;");
    int bottle=src.nextInt();
    System.out.println("number for which u e=want to exchange");
    int exchange=src.nextInt();
    int total= ninebottles(bottle,exchange);
    System.out.println("total drank"+total);
}
}
