package practical2;

public class p1swapping {
    public static void main(String[] args) {
        swapdemo m1= new swapdemo();
        m1.swapping(35, 40);
    }
}

class swapdemo{
    void swapping(int a,int b){
        System.out.println("Before swapping a:"+a+" "+"b:"+b);
        int temp;
        temp =a;
        a=b;
        b=temp;
        System.out.println("After swapping a:"+a+" "+"b:"+b);
    }
}