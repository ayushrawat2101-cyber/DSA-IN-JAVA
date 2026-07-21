package fundamental;
import java.util.Scanner;
public class pattern14 {
    public static void main(String[] args){
        int n ;
        Scanner sc = new Scanner (System.in);
        pattern14 obj = new pattern14();
        obj.display(sc.nextInt());
    }
    public void display(int n ){
        int star=1;
for(int i =0;i<n;i++){
for(int j =0;j<=i;j++){
    System.out.print(star+" ");
    star +=1;
}
System.out.println(" ");
}
    }
}
