import java.util.Scanner ;
public class problem09 {
    public static void main(String[] args ){
        int n ;
        System.out.print("Enter the number ");
        Scanner sc = new Scanner ( System.in);
        int a = sc.nextInt();
System.out.print(print(a));
    }
    public static int   print(int a ){
if ( a<=1){
    return a ;
}
int last =print(a-1);
int slast =print(a-2);
return last + slast ;
    }
}
