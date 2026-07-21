package fundamental;
import java.util.Scanner ;
import java.util.*;
public class pattern23 {
    public static void main(String[] args){
        int n ;
        Scanner sc = new Scanner (System.in);
        pattern23 obj = new pattern23();
        obj.display(sc.nextInt());
    }
    public void display(int n ){
for(int i =0;i<2*n-1;i++){
    for(int j=0;j<2*n-1;j++ ){
        int top =i;
        int left = j;
        int right = (2*n-2)-j;
        int bottom =(2*n-2)-i;
        System.out.print(n-Math.min(Math.min(top,bottom),Math.min(left,right)));
    }
    System.out.println(" ");
}
    }
}