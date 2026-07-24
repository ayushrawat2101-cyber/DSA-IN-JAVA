import java.util.Scanner;
import java.util.ArrayList;
public class mergesor {
    public static void ms1(int[]arr , int low , int mid , int high ){
        int left = low ;
        int right = mid + 1 ;
    ArrayList<Integer>  temp = new ArrayList<>();
while(left<=mid&&right<=high){
    if(arr[left]<=arr[right]){
         temp.add(arr[left]);
         left++;
    }
    else {
        temp.add(arr[right]);
        right ++;
    }
}
while (left <= mid  ){
    temp.add(arr[left]);
    left++;
}
while (right <= high){
    temp.add(arr[right]);
    right ++;
}
for(int i = low ; i<=high ;i++){
    arr[i]=temp.get(i-low);
}
    }
    public static void ms(int[] arr, int low, int high) {
        if (low >= high) {
            return;
        }
        int mid = (low + high) / 2;
        ms(arr, low, mid);
        ms(arr, mid + 1, high);
        ms1(arr, low, mid, high);
    }

    public static void main(String[] args) {
        int n;
        System.out.print("enter the size of an array ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("please enter the array elemnts ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        ms(arr, 0, n - 1);
        System.out.println("after apply merge sort the sorted array is:");
        for(int i =0 ;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
