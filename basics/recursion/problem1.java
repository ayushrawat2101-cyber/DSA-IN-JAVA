public class problem1 {
    int count =0;
    public static void main(String[] args ){
        problem1 obj =new problem1();
        obj.print();
    }
    public void print(){
        if(count==5){
            return;
        };
        System.out.println("ayush");
        count++;
        print();
    }
}
