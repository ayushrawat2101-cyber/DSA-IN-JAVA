import java.util.Scanner ;
public class pattern18 {
    public static void main(String[] args){
        int n ;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n ");
print(sc.nextInt());
    }
    public static void print(int n ){
for(int i =0 ;i<n;i++){
    int breakdown = (2*i+1)/2;
    for(int k =0;k<n-i-1;k++){
        System.out.print(" ");
    }
    char ch = 'A';
    for(int j =1;j<=2*i+1;j++){
        System.out.print(ch);
if(j<=breakdown){
    ch++;
}
else {
    ch--;
}

    }
    for(int k =0;k<n-i-1;k++){
        System.out.print(" ");
    }
    System.out.println(" ");
}
    }
}
