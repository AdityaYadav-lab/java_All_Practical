package practical8;
public class P4multicatch{
    public static void main(String[] args) {
        try {
            int arr[]={20,30,40,50,60};
            System.out.println("Array index "+arr[8]);
        } catch (ArithmeticException e) {
            System.out.println("Division by zero not possible");
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index is out of bound");
        }catch (Exception e) {
            System.out.println("Random error founded");
        }
        finally{
            System.out.println("Finally block is printed");
        }
    }
}