import java.util.Scanner;
public class pattern15 {
    public static void main(String[] args){
        int n ;
        Scanner sc = new Scanner(System.in);
        sc.nextInt();
        for(int i =0;i<2;i++){
            for(int j =65;j<=65+i;j++){
System.out.print((char)j);
            }
            System.out.println(" ");
        }
    }
}
