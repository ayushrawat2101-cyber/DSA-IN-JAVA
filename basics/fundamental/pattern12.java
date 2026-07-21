package fundamental;
import java.util.Scanner;
public class pattern12{
    public static void main(String[] args ){
        int n ;
        Scanner sc = new Scanner ( System.in);
        System.out.println("enter the value of n ");
       print( sc.nextInt());
    }
    public static void print(int n ){
         int star =2*(n-1);
        for(int i = 1;i<=n;i++){
            for(int j =1;j<=i;j++){
                System.out.print(j);
            }
            for(int k =1;k<=star;k++){
                System.out.print(" ");
            }
            for(int j =i;j>=1;j--){
                System.out.print(j);
            }
            star=star-2;
            System.out.println(" ");
    }
}
}