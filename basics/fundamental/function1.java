package basics.fundamental;
public class function1{
    public static void main(String[] args){
        System.out.println("hello");
        int num = 10 ;
        function1 obj = new function1();
        obj.display(num);
        System.out.println(num);
    }
  void display(int num){
    System.out.println(num);
    num+=5;
    System.out.println(num);
    num+=5;
    System.out.println(num);
  }
}