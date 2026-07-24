package fundamental;
import java.util.Scanner ;
public class pattern6{
    public static void main(String[] args ){
int n ;
Scanner sc = new Scanner (System.in);
pattern6 obj = new pattern6();
obj.display(sc.nextInt());
    }
    public void display(int n ){
for(int i =1;i<=n;i++){
    for(int j =1;j<=n-i+1;j++){
        System.out.print(j);
    }
    System.out.println(" ");
}
    }
}