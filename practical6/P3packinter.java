package practical6;

import practical6.mypack.Vehicle;

public class P3packinter
{
    public static void main(String[] args)
    {
        car c = new car();

        c.start();
        c.stop();
    }
}
class car implements Vehicle
{
    public void start()
    {
        System.out.println("Car started");
    }

    public void stop()
    {
        System.out.println("Car stopped");
    }
}