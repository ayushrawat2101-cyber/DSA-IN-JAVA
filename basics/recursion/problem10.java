import java.util.Scanner;
public class problem10 {
    public static void main(String[] args) { 
        int n;
        System.out.print("enter the no of terms ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int[] arr = new int[n];
        arr[0]=0;
        arr[1]=1;
for(int i =2 ;i<n;i++){
arr[i]=arr[i-1]+arr[i-2];
}
for(int i =0 ;i<n;i++){
    System.out.print(arr[i]+" ");
}
    }
}
