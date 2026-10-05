package practical6 ;
import practical6.mypackage.*;  // Package import

class MyPackage {
    public static void main(String args[]) {
        fileA a1 = new fileA();      // Class A object
        fileB b1 = new fileB();      // Class B object
        a1.A(20);
        b1.B(30);

        System.out.println("product of x and y from class A and B " + (a1.x*b1.y));

        a1.show();
        b1.show();

        
    }
}