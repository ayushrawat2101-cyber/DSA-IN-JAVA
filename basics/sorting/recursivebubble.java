import java.util.Scanner ;
public class recursivebubble{
    public static  void run(int[]arr , int i , int high ){
        if(i==high){
            return;
        }
        if(arr[i]>arr[i+1]){
        int temp =arr[i];
        arr[i]=arr[i+1];
        arr[i+1]=temp;
        }
    run(arr, i+1, high);
    }
public static void bubble(int[] arr ,int high ){
    if(high==0){
        return;
    }
    run(arr,0,high );
    bubble(arr, high-1);
}

    public static void main(String[] agrs ){
        int n ;
        System.out.print("enter the size of an array ");
Scanner sc = new Scanner(System.in);
n = sc.nextInt();
int[] arr = new int[n];
System.out.print("ENTER THE INPUT ARRAY ELEMNTS ");
for(int i = 0 ;i<n ;i++){
    arr[i]=sc.nextInt();
}
bubble(arr , n-1);
System.out.print("after recursive bubble sort the sorted array : ");
for(int i = 0 ;i<n ;i++){
    System.out.print(arr[i]+" ");
}
    }
}