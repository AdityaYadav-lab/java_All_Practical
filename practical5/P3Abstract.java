package practical5;

public class P3Abstract {
    public static void main(String[] args) {
        electric myCar = new electric();
        myCar.start();
        myCar.acceleration();
        myCar.brake();
/*
Left side (car)       → reference type
Right side (fuelcar) → actual object created 
*/
        car Car = new fuelCar();
        Car.start();
        Car.acceleration();
        Car.brake();
    }
}

abstract class car {
    void start() {
        System.out.println("car started");
    }

    abstract void acceleration();
    abstract void brake();
}

class fuelCar extends car {
    @Override
    void acceleration() {
        System.out.println("fuel car accelerating");
    }
    @Override
    void brake() {
        System.out.println("fuel car braking");
    }
}

class electric extends car {
    @Override
    void acceleration() {
        System.out.println("electric car accelerating");
    }

    @Override
    void brake() {
        System.out.println("electric car braking");
    }
}