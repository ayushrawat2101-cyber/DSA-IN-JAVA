package fundamental;
import java.util.Scanner;
public class pattern16 {
    public static void main(String[]args){
        int n =5;
        int star=65+n;
        for(int i =0 ;i<n;i++){
for(int j =65;j<star;j++){
    System.out.print((char)j);
}
star=star-1;
System.out.println(" ");
        }
    }
}
