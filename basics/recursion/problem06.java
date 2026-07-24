import java.util.Scanner ;
public class problem06 {
    public static void main(String[] args ){
        int n ;
        System.out.print("enter the value of e ");
        Scanner sc = new Scanner(System.in);
      int e =sc.nextInt();
        int arr[]=new int[e];
        for(int i =0 ;i<e;i++){
            arr[i]=sc.nextInt();
        }
        print(0,e,arr);
        for(int i =0;i<e;i++){
            System.out.print(arr[i]);
        }
    }
    public static void print(int i,int e ,int arr[]){
        if(i>=e/2){
return;
        }
        swap(arr,i,e-i-1);
        print(i+1,e,arr);
    }
    static void swap(int arr[],int i , int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}
