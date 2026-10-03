package practical1;
public class p9factorial {
    public static void main(String[] args) {

      int num=Integer.parseInt(args[0]);
      System.out.println("enter number is -->"+ num);

      //begin of factorial start with 1 
      int fact =1;

      for (int i=1;i<=num;i++){
         fact =fact*i;
         System.out.println("given number of factorical is -->"+fact);
      }
       System.out.println("final ans of factorial of-->"+num+" is "+fact);

   }
}
