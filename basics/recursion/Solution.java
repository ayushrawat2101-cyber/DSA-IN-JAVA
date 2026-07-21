import java.util.Scanner ;
class Solution{
    public static void main(String[] args ){
int n;
System.out.println("enter the  number input ");
Scanner sc = new Scanner (System.in);
int b =sc.nextInt();
Solution obj =new Solution();
obj.print(1, b);
    }
    int sum =0 ;
    public void print(  int i , int n ){
        if(i>n){
             System.out.println("the sum of first N number is "+sum);
             return;
        }
        sum =sum+i;
        print(i+1,n); 
    }
        
  
}