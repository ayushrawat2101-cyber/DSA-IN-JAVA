import java.util.Scanner ;
import java.util.Map;
import java.util.HashMap;
public class Hashmap{
    public static void main(String[] args){
int n;
System.out.print("Enter the number ");
Scanner sc  = new Scanner ( System.in);
 n = sc.nextInt();
 int[] arr = new int[n];
 Map<Integer , Integer   > map = new Hashmap<>();
 for(int i =0;i<n;i++){
    arr[i]=sc.nextInt();
    map.put(arr[i],map.getOrDefault(arr[i],0)+1);
 }
 System.out.print("Enter the query number ");
 int q = sc.nextInt();
 while ( q>0){
    int numbers = sc.nextInt();
    System.out.print(map.get(numbers ));
 }
    }
}
