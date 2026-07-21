import java.util.Scanner ;
public class recursivequick {
    public static void swap (int[]nums , int i , int j ){
        int temp = nums[i];
        nums[i]= nums[j];
        nums[j]=temp;
    }
    public static int part(int[]nums , int low , int high ){
        int pivot = nums[high];
        int i = low -1 ;
        for(int j = low ; j<high;j++){
            if(nums[j]<=pivot ){
                i++;
            }
            swap(nums , i , j );
        }
        swap(nums , i+1, high );
        return i+1;
    }
    public static void quicksort(int[]nums , int low , int high ){
        if(low<high){
            int pi = part(nums , low , high );
            quicksort(nums , low , pi-1);
            quicksort(nums , pi+1, high );
        }
    }
    public static void main(String[] args ){
        int n ;
        System.out.print("ENTER THE SIZE OF AN ARRAY ");
        Scanner sc = new Scanner (System.in);
        n = sc.nextInt();
    int[]nums = new int[n];
    System.out.print("ENTER THE SIZE OF AN ARRAY ");
    for(int i = 0 ;i<n ;i++){
        nums[i]=sc.nextInt();
    }
    quicksort(nums , 0 ,nums.length-1);
    for(int arr : nums){
        System.out.print(arr+" ");
    }
    }
}
