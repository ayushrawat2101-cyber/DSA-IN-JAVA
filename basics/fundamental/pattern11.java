package fundamental;
import java.util.Scanner;
public class pattern11 {
    public static void main(String[] args ){
  int n ;
  Scanner sc = new Scanner ( System.in);
  print(sc.nextInt());      
    }
    
    public static void print(int n ){
        int star=1;
        for(int i =0 ;i<n;i++){
            if(i%2==0){
star=1;
}
else {
    star=0;
}
            for(int j =0;j<=i;j++){
System.out.print(star);
star =1- star;
            }
            System.out.println(" ");
        }
    }
}
