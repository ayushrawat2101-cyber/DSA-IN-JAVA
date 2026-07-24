import java.util.Scanner ;
public class highest{
    public static void main(String[] args ){
        int n ; 
        System.out.print("ENTER THE ARRAY SIZE ");
        Scanner sc = new Scanner ( System.in);
        n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0 ;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        int[] hash = new int[10];
        for(int i =0 ;i<arr.length;i++){
          hash[arr[i]]++;
        }
        // int q =sc .nextInt();
        // while (q>0){
        //     int numbers = sc.nextInt();
        //     System.out.print(hash[numbers]);
        // }
        int max_freq = 0 ;
        int ans = 0 ;
        for(int i =0 ;i<hash.length;i++){
if(hash[i]>max_freq){
    max_freq= hash[i];
    ans = i ;
}
else if (hash[i]==max_freq&& i<ans ){
ans = i ;
}

        }
        System.out.print("the highest ocuuring element is "+ans);
    }
}

