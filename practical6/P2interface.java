package practical6;

public class P2interface{
    public static void main(String[] args)
    {
        Car c = new ElectricCar();

        c.start();
        c.stop();
    }
}

interface Car
{
    void start();
    void stop();
}

class ElectricCar implements Car
{
    public void start()
    {
        System.out.println("Electric car started");
    }

    public void stop()
    {
        System.out.println("Electric car stopped");
    }
}
