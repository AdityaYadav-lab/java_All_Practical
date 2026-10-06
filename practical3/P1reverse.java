package practical3;
import java.io.DataInputStream;

public class P1reverse{
    public static void main(String[] args) {
        DataInputStream dis =new DataInputStream(System.in);
        try {
            System.out.println("Enter the number");
            int num=Integer.parseInt(dis.readLine());
            reverse(num);
        } catch (Exception e) {
            System.out.println("invalid input");
        }
    }
    static void reverse (int num){
        int reverse =0;
        while(num>0){
           int digit =num%10;
           reverse=reverse*10+digit;
           num=num/10;
        }
        System.out.println("Reversed number -->"+reverse);
    }

}

