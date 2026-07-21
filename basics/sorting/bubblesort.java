import java.util.Scanner ;
public class bubblesort {
    public static void bubblesort(int[]nums, int n){
        for(int i = n-1;i>=0;i--){
            for(int j = 0 ; j<=i-1;j++){
                int dsp = 0 ;
                if(nums[j]>nums[j+1]){
                    int temp =nums[j];
                    nums[j]=nums[j+1];
                    nums[j+1]=temp;
                    dsp=1;
                }
                if(dsp==0){
                    break ;
                }
            }
        }
    }
    public static void main(String[] args ){
     int n;
     System.out.print("ENTER THE ARRAY SIZE ");
     Scanner sc = new Scanner ( System.in);
     n = sc.nextInt();
     int[] nums = new int[n];
     for(int i = 0 ;i<n ;i++){
        nums[i]=sc.nextInt();
     }    
     bubblesort(nums, n );
     for(int i =0 ;i<n;i++){
        System.out.print(nums[i]+" ");
     }
    }

}
