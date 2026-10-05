package practical8;
import java.util.Random;//its main in this 
public class P2random {
    public static void main(String[] args) {
        Random r =new Random ();
        //nextInt -->give differnt integer number by using ramdom class
        int num1= r.nextInt(11);
        int num2 =r.nextInt(2);

        try {
            int result =num1/num2;
            System.out.println("the division result -->"+result);            
        } catch (Exception e) {
            System.out.println("the division not happen pls try again");
        }
    }
}
