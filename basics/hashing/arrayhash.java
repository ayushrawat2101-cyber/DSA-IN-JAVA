import java.util.Scanner ;
public class arrayhash {
    public static void main(String[] args ){
        int n ;
        System.out.print("ENTER THE ARRAY SIZE INPUT ");
        Scanner sc = new Scanner (System.in);
        n=sc.nextInt();
        System.out.print("enter the array elements ");
        int arr[] = new int[n];
for(int i =0 ;i<arr.length;i++){
arr[i]=sc.nextInt();
}
int hash[] =new int[100];
for(int i =0 ;i<arr.length;i++){
    hash[arr[i]]++;
}
System.out.print("enter the query numbers ");
int q =sc.nextInt();
while(q-->0){
    int numbers =sc.nextInt() ;
   System.out.println(hash[numbers ]);
}
    }
    
}
