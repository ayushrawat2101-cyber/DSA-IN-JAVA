package fundamental;
import java.util.Scanner;
public class pattern13 {
    public static void main(String[] args ){
        int n ;
        Scanner sc = new Scanner(System.in);
        sc.nextInt();
        for(int i =1;i<=4;i++){
            for(int j=i;j>=1;j--){
                System.out.print(j);
            }
            System.out.println(" ");
        }
    }
}
