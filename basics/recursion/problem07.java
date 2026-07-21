import java.util.Scanner ;
public class problem07 {
    public static void main(String[] args ){
        int size ;
        System.out.print("enter the size of an array ");
        Scanner sc = new Scanner (System.in);
        size =sc.nextInt();
        int arr[]= new int[size];
        for(int i =0 ;i<size;i++){
         arr[i]=sc.nextInt();
        }
        print(0,size-1,arr);
        for(int i =0;i<size;i++){
            System.out.print(arr[i]);
        }

    }
    public static void print(int l , int r ,int arr[] ){
if(l>=r){
    return;
}
swap(arr,l,r);
print(l+1, r-1, arr);
    }
    static void swap(int arr[] , int i , int j ){
        int temp =arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}
