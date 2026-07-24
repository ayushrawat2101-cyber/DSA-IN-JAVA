import java.util.Scanner ;
public class insertionsort {
  public static void insertionsort(int n , int[]arr){
for(int i =0 ;i<=n-1;i++){
    int j =i;
    while(j>0 && arr[j-1]>arr[j]){
    int temp =arr[j];
    arr[j]=arr[j-1];
    arr[j-1]=temp;
    j--;
}
}
    }
    public static void main(String[] args ){
        int n ; 
        System.out.print("ENTER THE ARRAY SIZE ");
        Scanner sc = new Scanner (System.in);
        n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("input the elements in an array :");
        for(int i =0 ;i<arr.length;i++){
            arr[i] =sc.nextInt();
    }
    insertionsort(n,arr);
    System.out.println("the sorted array is ");
    for(int i = 0 ;i<n;i++){
        System.out.print(arr[i]+" ");
    }
    
}
}
