package practical4;
public class p5MethodOver
{
    public static void main(String[] args)
    {
        Animal a = new Animal();
        Dog d = new Dog();

        a.sound();
        d.sound();
    }
}

class Animal
{
    void sound()
    {
        System.out.println("Animal makes a sound");
    }
}
class Dog extends Animal
{
    // Method Overriding
    @Override 
    void sound()
    {
        System.out.println("Dog barks");
    }
}