import java.util.Scanner ;
public class divisor{
    public void  gcd(int a , int b ){
        int hcf =1;
for(int i =1;i<=Math.min(a,b);i++){
if(a%i==0 && b%i==0){
hcf=i;
}
}
System.out.print(hcf);
}
    public static void main(String[] args ){
divisor obj = new divisor();
obj.gcd(9,12);
    }
}