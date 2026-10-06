package practical10;

public class P3syncro {
    public static void main(String[] args) {
       Bank bank =new Bank();

       Thread s1 =new Thread(() ->bank.deposit());
       Thread s2 =new Thread(() ->bank.withdraw());
       
       s1.start();
       s2.start();
    }
}
class Bank {
    
    synchronized void deposit(){
        
            System.out.println("deposit logic happen");
           try {
             Thread.sleep(1000);
            } catch (Exception e) {}
       

    }
     synchronized void withdraw(){
        
          System.out.println("withdraw logic happen");
            try {
              Thread.sleep(1000);
            } catch (Exception e) {}
        
    }
}

