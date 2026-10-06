package practical9;
import java.io.*;

public class P3readandwrite {
    public static void main(String arg[]) throws Exception {
       String p;
      try{
          BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
          System.out.println("Enter the data you want to write in a file");
          p=br.readLine();
          System.out.println(p); 
          System.out.println("Writing data in a file entered by the user on console");
          FileWriter fw=new FileWriter("practical9/abc.txt");
          fw.write(p); 
          fw.close();
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}

