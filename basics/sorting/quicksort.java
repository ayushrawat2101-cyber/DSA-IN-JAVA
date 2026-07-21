import java.util.Scanner;
public class quicksort {
    public static void swap(int[]arr , int a , int b ){
        int temp = arr[a] ; 
        arr[a] = arr[b] ;
        arr[b]=temp;
    }
   public static int  part(int[]arr,int low , int  high ){
    int pivot = arr[low];
    int i = low;
    int j =high;
    while(i<j){
        while(arr[i]<=pivot&&i<=high-1){
            i++;
        }
        while(arr[j]>pivot&&j>=low+1){
            j--;
        }
        if(i<j){
            swap(arr, i , j );
        }
    }
    swap(arr, low, j);
    return j;
   }
    public static void  quick(int[]arr , int low , int high){
        if(low<high){
            int partitionindex = part(arr,low,high);
            quick(arr, low,partitionindex-1);
            quick(arr, partitionindex+1, high); 
        }
    }
    public static void main(String[] args ){
        int n ;
        System.out.print("ENTER THE SIZE OF AN ARRAY ");
        Scanner sc = new Scanner(System.in);
        n=sc.nextInt();
        int[]arr = new int[n];
        System.out.print("ENTER THE ARRAY ELEMENT :");
        for(int i = 0 ;i<n;i++){
arr[i]=sc.nextInt();
        }
        quick(arr, 0 , n-1);
        System.out.print("AFTER APPLYING QUICK SORT THE SORTED ARRAY MUST BE : ");
        for(int i = 0 ; i<n ;i++){
           System.out.print(arr[i]+" ");
        }
    }
}
