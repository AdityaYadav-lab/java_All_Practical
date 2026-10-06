package practical9;
import java.io.*;

public class P2read {
    public static void main(String arg[]) throws Exception {
            FileReader fr=new FileReader("practical9/abc.txt");
            int i;
            while((i=fr.read())!=-1){
              System.out.print((char)i);
            }
            fr.close();
    }
}