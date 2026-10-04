package practical4;
/*
 * use same function to perform method overloading
 * 1. no. of parameter should be different
 * 2. change the datatype
 * 3. change order of parameter
 */
public class P3Method {
    public static void main(String[] args) {
        // method overloading
        int x = sum(10, 20);
        System.out.println("the first method " + x);

        int y = sum(10, 20, 30);
        System.out.println("the second method " + y);

        double z = sum(1.2, 2.2);
        System.out.println("the third method " + z);
    }

    static int sum(int a, int b) {
        return a + b;
    }

    static int sum(int a, int b, int c) {
        return a + b + c;
    }

    static double sum(double a, double b) {
        return a + b;
    }
}