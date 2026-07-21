package fundamental;
public class pattern21 {
    public static void main(String[] args){
        int n=5 ;
        for(int i =1 ;i<=2*n-1;i++){
            int stars = i;
            if(i>n){
                stars = 2*n-i;
            }
            for(int j =1;j<=stars;j++){
System.out.print("*");
            }
                int space = 2*n-2*i;
                if(i>n){
                    space =2*i-2*n;
                }
                for(int j =1;j<=space;j++){
                    System.out.print(" ");
                }
            if(i>n){
                stars = 2*n-i;
            }
            for(int j =1;j<=stars;j++){
System.out.print("*");
            }
             System.out.println(" ");
            }
        
        

    }
}
