package OOPS;

// abstraction : hiding implementation features whilst showing only necessary features
abstract class Car {
    abstract  public void start();
    public void noise(){
        System.out.println("Noise...");
    }
}


// this is also abstraction. It has defined method but hasn't implemented it.
// before java 8
interface CarInterface {
    public void start();

    default void noise() {
        System.out.println("Noise...");
    }

    static void numberOfWheels() {
        System.out.println("Wheels 4");
    }
}

class Manual extends Car {
    public void start(){
        System.out.println("Manual car is running");
    }
}

class ManualINT implements CarInterface{
    public void start() {
        CarInterface.numberOfWheels();
        System.out.println("Manual INT car is starting...");
    }
}

class AutomaticCar extends Car{
    public void start(){
        System.out.println("Automatic car is starting");
    }
}



class Main{
    public static void main(String[] args) {
        Manual manualCar = new Manual();
        manualCar.start();
        manualCar.noise();
        ManualINT manualINT = new ManualINT();
        manualINT.start();
        AutomaticCar automaticCar = new AutomaticCar();
        automaticCar.start();
    }
}