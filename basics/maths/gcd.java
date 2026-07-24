import java .util.Scanner ;
public class gcd {
    public static void main(String[] args ){
        int n1,n2; 
        Scanner sc = new Scanner (System.in);
        System.out.print("enter the value of n1"+" ");
        n1 = sc.nextInt();
        System.out.print("enter the value of n2"+" ");
        n2 = sc.nextInt();
        int a =0;
        int b =0;
for(int i =1 ;i<=n1;i++){
if(n1%i==0){
     a = i;
    System.out.print(a+" ");
}
}
System.out.println(" ");
for(int j=1 ;j<=n2;j++){
if(n2%j==0){
     b =j;
    System.out.print(b+" ");
}
}
    }
    
}
