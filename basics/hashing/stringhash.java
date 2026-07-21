import java.util.Scanner ;
public class stringhash {
    public static void main(String[] args ){
            String str ;
            System.out.print("enter the string input ");
            Scanner sc = new Scanner (System.in);
             str = sc.nextLine();
             int hash[] =new int[26];
             for(int i =0 ;i<str.length();i++){
                hash[str.charAt(i)-'a']++;
             }
             System.out.print("enter the query number ");
             int q=sc.nextInt();
             while (q>0){
               char ch ;
               ch = sc.next().charAt(0);
                System.out.print(hash[ch-'a']);
             }

    }
}
