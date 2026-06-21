import java.util.Scanner ;
public class digit {
    public static void main(String[] args ){
    int n ;
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the number ");
    n =sc.nextInt();
   digit obj = new digit();
   obj.print(n);
    }
    public void print(int n){
        int count = 0;
        while(n!=0){
            n =n/10;
            count +=1;
        }
        System.out.print("the digit in number is "+count);
    }
}
