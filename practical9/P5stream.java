package practical9;
import java.io.*;

public class P5stream {
    public static void main(String[] args) {
        try {
            FileInputStream fin =new FileInputStream("practical9/source.txt");
            FileOutputStream fout =new FileOutputStream("practical9/destination.txt");
             int ch;
             while((ch=fin.read())!=-1){
                fout.write(ch);

             }
             fin.close();
             fout.close();
             System.out.println("File copied succefully");
        } catch (Exception e) {
            System.out.println("Error"+e);
            
        }
    }
}
