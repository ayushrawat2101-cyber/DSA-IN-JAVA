package basics.fundamental;
import java.util.Scanner;
/*public class pattern1{
    public static void main(String[] args ){
        /*for(int i = 0 ; i<4;i++){
            for(int j = 0 ;j<4;j++){
                System.out.print("*");
            }
            System.out.println(" ");
        }
       int n;
       Scanner sc = new Scanner(System.in );

    }

}*/
public class pattern1{
    public static void main(){
    int n ;
   /*  Scanner sc = new Scanner(System.in);
    System.out.println("enter the rows ");
        sc.nextInt();*/
        pattern1 obj = new pattern1();
        obj.print(4);
    }
    void print(int n ){
        for(int i = 0 ;i<n;i++){
            for(int j = 0 ; j<n;j++){
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}