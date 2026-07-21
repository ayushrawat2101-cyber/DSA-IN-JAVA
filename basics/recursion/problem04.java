import java.util.Scanner ;
public class problem04 {
    public static void main(String[] args ){
        int n ;
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the number ");
       int  a = sc.nextInt();
        problem04 obj =new problem04();
        obj.print( a,a);
    }
    public void print(int i ,int n ){
        if(i<1){
            return ;
        }
System.out.println(i);
print(i-1,n);
    }
}
