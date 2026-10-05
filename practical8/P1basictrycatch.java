package practical8;

public class P1basictrycatch {
    public static void main(String[] args) {
        System.out.println("step--1");
        try {
            int a =10;
            int b =0;
            int c = a/b;
            System.err.println(c);
        } catch (ArithmeticException e) {
            System.out.println("It is wrong !!! Pls check the value");
        }
        System.out.println("Step--2");
    }
}
