import java.util.Scanner;
public class rev {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        display(n);
    }
    public static void display(int n) {
int rev =0 ;
int temp =n;
int digit ;
        while (n != 0){
             digit = n % 10;
             rev = rev*10+ digit;
            n = n / 10;
        }
        System.out.println("the reverse of the number is "+ rev );
        if( temp == rev){
            System.out.print("true it is palindrome ");
        }
        else {
            System.out.print("False it is not palindrome ");
        }
        
    }

    }
