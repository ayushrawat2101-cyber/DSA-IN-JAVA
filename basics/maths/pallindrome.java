import java.util.Scanner ;
public class pallindrome {
    public static void main(String[] args ){
        int n ;
        Scanner sc = new Scanner ( System.in);
        print(sc.nextInt());
    } 
    public static void print(int n ){
        while(n!=0){
        int rev = n%10;
        n=n/10;
        }
        int c = rev ;
        if(n == c){
            System.out.print("the given number is palindrome "+"TRUE");
        }
        else {
            System.out.print("the given number is not palindrome"+"FALSE");
        }
    }
}
