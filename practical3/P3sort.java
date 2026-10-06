package practical3;
import java.io.BufferedReader;   
import java.io.InputStreamReader;  
import java.util.Arrays;

public class P3sort {
    
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(
                            new InputStreamReader(System.in));
        
        try {
            System.out.print("Enter number of names: ");
            int n = Integer.parseInt(br.readLine());
            
            String[] names = new String[n];
            
            System.out.println("Enter " + n + " names:");
            for (int i = 0; i < n; i++) {
                System.out.print("Name " + (i + 1) + ": ");
                names[i] = br.readLine();
            }
            
            // Sort karo
            Arrays.sort(names);
            
            System.out.println("\n===== Sorted Names (Ascending) =====");
            for (int i = 0; i < n; i++) {
                System.out.println((i + 1) + ". " + names[i]);
            }
            
        } catch (Exception e) {
            System.out.println("inavlid input ");
        }
    }
}