package practical9;
import java.io.*;

public class P1console {
      public static void main(String args[]) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String str[]=new String[100];
        System.out.println("Enter lines of code");
        System.out.println("Enter 'stop' to quit....");

        for(int i=0;i<100;i++){
           str[i]=br.readLine(); 
           if(str[i].equals("stop")) 
           break;
        }
       System.out.println("\n\nHere is Your content......\n\n");

        for(int i=0;i<100;i++){
           if(str[i].equals("stop"))
                break;
            System.out.println(str[i]);
        }
    }
}
