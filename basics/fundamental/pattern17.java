package fundamental;
public class pattern17 {
    public static void main(String[] args){
        int n =5;
        int star=65;
        for(int i =0;i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.print((char)star);
            }
            star+=1;
            System.out.println(" ");
        }
    }
}
