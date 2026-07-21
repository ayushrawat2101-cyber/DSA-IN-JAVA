package fundamental;
public class pattern8 {
    public static void main(String[] args){
int n ;
pattern8 obj = new pattern8();
obj.display(5);

    }
    public void display(int n ){
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
