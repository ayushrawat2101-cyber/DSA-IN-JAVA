package fundamental;
public class pattern20 {
        public static void main(String[] args ){
        int n = 5;
        for(int i =0 ;i<n;i++){
for(int j=0 ; j<n-i;j++){
System.out.print("*");
}
for(int k =0 ;k<=2*i;k++){
    System.out.print(" ");
}
for(int j =0; j<n-i;j++){
    System.out.print("*");
}
System.out.println(" ");
        }
         int stars = 2*n-1 ;
        for(int i = 0 ;i<n;i++){
            for(int j =0;j<=i;j++){
                System.out.print("*");
            }
            for(int k=0 ;k<stars;k++){
                System.out.print(" ");
            }
            for(int j =0 ;j<=i;j++){
                System.out.print("*");
            }
            stars -=2;
            System.out.println(" ");
        }
}
}
