import java.util.Scanner ;
public class  recursiveinsertion {
    public static void swap(int[]nums ,  int i ,int  j ){
        int temp = nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
    public static void insert(int[]nums , int i , int n ){
        if(i==n){
            return;
        }
         int j = i ;
        while (j>0&&nums[j-1]>nums[j]){
            swap(nums , j-1, j);
            j--;
        }
        insert(nums , i+1,n);
    }
    public static void main(String[] args){
        int n ;
        System.out.print("ENTER THE ARRAY SIZE");
        Scanner sc = new Scanner (System.in);
        n=sc.nextInt();
        int[]nums = new int[n];
        System.out.print("ENTER THE ARRAY ELEMENTS ");
        for(int i =1 ;i<n;i++){
            nums[i]=sc.nextInt();
        }
        insert(nums , 0 , n);
        System.out.print("AFTER APPLYING NSERTION SORT : ");
        for(int i = 0 ;i<n;i++){
            System.out.print(nums[i]+" ");
        }


    }
}
