import java.util.Scanner;
public class arm{
    public static void main(String[] args ){
int n ;
Scanner sc = new Scanner (System.in);
System.out.println("enter the number input ");
 int a=sc.nextInt();
arm obj = new arm();
obj.arms(a);
    }
    public void arms(int n ){
        int c = n ;
        int d = n ;
        int count =0;
while ( n !=0){
    int rev = n %10;
    n=n/10;
    count+=1;
}
System.out.println("the number of digit in the given number is "+count);
double  sum =0 ;
while(c!=0){
    int rev = c%10;
    double a = Math.pow(rev, count);
    sum =sum + a ;
    c=c/10;
}
// System.out.println(sum);
int b =(int )sum;
//  System.out.println(b);
if(b==d){
    System.out.println(" yes the number is arstrong number ");
}
else {
    System.out.println("the number is not armstrong number ");
}
    }
}