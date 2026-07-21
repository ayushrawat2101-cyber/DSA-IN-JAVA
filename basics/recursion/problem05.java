import java.util.Scanner ;
public class problem05 {
    public static void main(String[] args ){
        int n ;
        System.out.println("enter the number ");
         Scanner sc = new Scanner (System.in);
        int b =sc.nextInt();
        problem05 obj = new problem05();
        obj.print(1,b);
    
    }
    int fact =1;
    public void print(int i , int n ){
if(i>n){
    System.out.print("the factorial of a number "+fact);
    return;
}
fact =fact*i;
print(i+1 , n);
    }
}
