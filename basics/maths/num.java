import java.util.Scanner ;
class num {
     public static void main(String[] args ){
        int n ;
        Scanner sc =new Scanner (System.in);
        System.out.print("enter the number ");
     num  obj =new num();
        obj.isPrime(sc.nextInt());
    }
    public void  isPrime(int n) {
      if (n==1 ){
         System.out.print("it is not an prime number ");
      }
          for(int i = 2 ;i<n;i++){
         
             if(n%i==0){
           System.out.print("false it is not a prime number  ");
           break;
            }else {
            System.out.print("true it is an prime number  ");
         break;
      }
          }
         
    }
   
}