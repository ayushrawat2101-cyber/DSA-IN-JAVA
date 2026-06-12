import java.util.Scanner ;
public class pattern5{
    public static void main(String[] args ){
        int n  ; 
        Scanner sb = new Scanner (System.in);
pattern5 obj =new pattern5();
obj.display(sb.nextInt());
    }
    public void display(int n ){
        int r=n;
        for(int i =1;i<=n;i++){
            for(int j = 1;j<=r;j++ ){
                System.out.print("*");
            }
            r=r-1;
            System.out.println(" ");
        }
    }
}