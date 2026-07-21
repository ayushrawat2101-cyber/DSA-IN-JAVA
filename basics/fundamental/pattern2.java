package fundamental;
import java.util.Scanner;
public class pattern2{
    public static void main(String[] args ){
        int n ;
        Scanner sc = new Scanner (System.in);
    print( sc.nextInt());
    }
public  static void  print (int n ){
for(int i =1;i<=n;i++){
    for(int j = 1;j<=i;j++){
        System.out.print("*");
    }
    System.out.println("");
}
}
}