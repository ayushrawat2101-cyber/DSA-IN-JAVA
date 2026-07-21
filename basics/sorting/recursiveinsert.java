import java.util.Scanner ;
public class recursiveinsert {
    public static void run(int[]nums , int j ){
        while (j>0&& nums[j-1]>nums[j]){
            int temp = nums[j];
            nums[j]=nums[j-1];
            nums[j-1]=temp ;
            j--;
        }
        run(nums , j+1);
    }
    public static void insert (int[]nums , int high ){
        run(nums,0);
    }
    public static void main(String[] args ){
        int n ;
        System.out.print("enter the size of an array ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int[]nums = new int[n];
        System.out.print("enter the array elemnts ");
        for(int i = 0 ; i<n ;i++){
            nums[i]=sc.nextInt();
        }
        insert(nums, n-1);
        for(int i = 0 ;i<n ;i++){
            nums[i]=sc.nextInt();
        }
    }
}
