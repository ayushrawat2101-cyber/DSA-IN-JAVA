import java.util.Scanner ;
class Solution1 {
   
    public void  divisors(int n) {

    int count = 0;

    for(int i=1; i<=n; i++){
        if(n%i==0){
            count++;
        }
    }

    int arr[] = new int[count];

    int index = 0;

    for(int i=1; i<=n; i++){
        if(n%i==0){
            arr[index] = i;
            index++;
        }
        // System.out.print(arr[i]);
    
    }
    
  
} public static void main(String[] args ){
        int n ;
         Scanner sc = new Scanner(System.in);
        Solution obj =new Solution();
        obj.divisors(sc.nextInt());
    }
}