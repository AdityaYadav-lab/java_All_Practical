package practical4;
/*
1. super.variable → access parent class variable
2. super.method() → call parent class method
3. super()        → call parent class constructor
*/
public class P2super{
    public static void main(String[] args)
    {
        student s = new student();

        s.show();
    }
}

class person
{
    String name = "Aditya";

    person()
    {
        System.out.println("The person constructor");
    }

    void display()
    {
        System.out.println("The person method");
    }
}

class student extends person
{
    String name = "Rohit";

    student()
    {
        super();
    }

    void show()
    {
        super.display();

        System.out.println("Parent class name: " + super.name);
        System.out.println("Child class name: " + name);
    }
}