package practical8;

public class P3multi
{
    public static void main(String[] args)
    {
        // First try-catch-finally
        try
        {
            System.out.println("First try block");
            System.out.println(10 / 0);
        }
        catch (ArithmeticException e)
        {
            System.out.println("Cannot divide by zero");
        }
        finally
        {
            System.out.println("First finally block");
        }

        // Second try-catch-finally
        try
        {
            System.out.println("Second try block");

            int arr[] = {10, 20, 30};
            System.out.println(arr[5]);
        }
        catch (ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Array index is out of bounds");
        }
        finally
        {
            System.out.println("Second finally block");
        }
    }
}