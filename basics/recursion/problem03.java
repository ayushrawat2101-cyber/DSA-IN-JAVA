import java.util.Scanner ;
public class problem03 {
    public static void main(String[] args ){
        int n ;
        System.out.print("enter the number ");
        Scanner sc = new Scanner (System.in);
        int a = sc.nextInt();
problem03 obj =new problem03() ;
obj.print(1,a);
    }
    public void print(int i , int n ){
if(i>n){
    return;
}
System.out.println(i);
print(i+1,n);
    }
    
}
