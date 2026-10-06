package practical3;
import java.io.DataInputStream;
public class P2read {
    public static void main(String[] args) {
        DataInputStream dt =new DataInputStream(System.in);
        try {
            int x=0;
            float y=0.0f;
            System.out.println("Enter integer nummber");
            x =Integer.parseInt(dt.readLine());
            System.out.println();
            System.out.println("Enter float nummber");
            y = Float.parseFloat(dt.readLine());
            System.out.println("prouduc of x and y is "+x*y);

        } catch (Exception e) {
            System.out.println("Error is"+e);
            
        }
    }
}
