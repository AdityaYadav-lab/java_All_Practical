package practical1;
public class p8greet {
    public static void main(String[] args) {
        int num ;
        num=Integer.parseInt(args[0]);
        System.out.println("enter the marks :"+" "+num);
        
        if (num>=90){
            System.out.println("A grade");
        }
        else if(num>=80){
            System.out.println("B grade");
        }
        else if (num>=70){
            System.out.println("C grade");
        }
        else {
            System.out.println("p grade");
        }
    }
}
