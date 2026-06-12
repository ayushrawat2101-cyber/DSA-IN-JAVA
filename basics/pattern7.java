public class pattern7{
    public static void main(String[] args ){
        int n ;
        pattern7 obj = new pattern7();
        obj.display(2);
        
    }
    public void display(int n ){
        for(int i = 0;i<n;i++){
            //space
            for(int j =0 ;j<=n-i-1;j++){
System.out.print(" ");
            }
            //star
            for(int k =0;k<2*i+1;k++){
                System.out.print("*");
            }
            //space 
            for(int l=0;l<n-i-1;l++){
                System.out.print(" ");
            }
            System.out.println(" ");
        }
    }
}