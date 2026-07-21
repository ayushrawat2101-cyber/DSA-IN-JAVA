import java.util.Scanner ;
public class problem02 {
    public static void main(String[] args ){
        int n ;
        Scanner sc =new Scanner (System.in);
       int a =  sc.nextInt();
       problem02 obj = new problem02();
       obj.print(1,a);
    }
     public void print(int i, int n){
if(i>n){
    return;
}
System.out.println("ayush");
print(i+1,n);
    }
}
