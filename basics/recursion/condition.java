class condition{
    int cnt =0;
    public void print(){
        if(cnt ==3 ){
            return;
        }
System.out.println(cnt);
cnt++;
print();
    }
    public static void main(String[] args ){
        condition obj = new condition();
       obj. print();
    }
}