import java.util.Scanner ;
public class GCD1 {
    public static void main(String[] args ){
        int a , b ;
        System.out.print("enter the value of a ");
        Scanner sc = new Scanner ( System.in);
        System.out.print("enter the value of b ");
        Scanner sb = new Scanner ( System.in);
gcd( sc.nextInt(), sb.nextInt()  );
    }
    public static  void gcd (int a , int b ){
while (a>0&&b>0){
    if (a > b){
        a =a %b ;
    }
    else {
        b=b%a;
    }
}
 if (a==0){
        System.out.print("the hcf of two numbers is "+b);
    }
    else {
        System.out.print("the hcf of two number is "+a);
    }
    }
}
