
public class P3telephone{
    public static void main(String[] args) {
    int tele;
    int call;
    tele=Integer.parseInt(args[0]);
    call=Integer.parseInt(args[1]);
    Bill b=new Bill();
    double total=b.calculate(call);
    
    System.out.println("the telephone number is :"+tele);
    System.out.println("the number of calls is :"+call);
    System.out.println("the total bill is :"+total);  
    }
}
class Bill{
    double calculate(int call){
        double amt=400;
        if(call<=150){
            System.out.println("the fixed rent is :"+amt);  
            return amt;       
        }
        else{
            amt =400+(call-150)*0.8;
            System.out.println("the total bill is :"+amt);
            return amt;
        } 
    }
}