 /*public class function2 {
     static void change ( int x ){
         System.out.println("x value is "+x);
         x=100;
         System.out.println("x value is "+x);
     }
 public static void main (String[] args ){
         int a = 10 ;
         change(a);
         System.out.print(a);
     }
 }*/
class student{
    String name ;
}
class MAIN{
    static void change (student s ){
        System.out.print(s.name);
        s.name ="ayush";
    }
    public static void main(String[] args ){
student st = new student();
st.name ="rahul";
change(st);
System.out.print(st.name);
    }
}

