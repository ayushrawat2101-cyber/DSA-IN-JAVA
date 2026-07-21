package fundamental;
public class pattern9{
    public static void main(String[] args ){
         int n ;
         pattern9 obj = new pattern9();
         obj.print(5);
    }
    public void print(int n ){
        for(int i = 0 ;i<n;i++){
            for(int j =0 ;j<n-i-1;j++){
                System.out.print(" ");
            }
            for(int k = 0 ;k<2*i+1;k++){
                System.out.print("*");
            }
            for(int l=0;l<n-i-1;l++){
                System.out.print(" ");
            }
            System.out.println(" ");
        }
        for(int i =0 ;i<n;i++){
    for(int j = 0 ; j<i;j++){
        System.out.print(" ");
    }
    for(int k = 0 ;k<2*n-(2*i+1);k++){
System.out.print("*");
    }
    for(int l =0 ;l<i;l++){
        System.out.print(" ");
    }
    System.out.println(" ");
}
    }

}