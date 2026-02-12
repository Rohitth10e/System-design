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


interface NewCarInterface {
  public void start();
  public void numberOfGears();

  // default and static methods can be defined in interface from java 8 onwards
  default void airBags() {
    System.out.println("Airbags are present: 5");
  }

  // what is default method in interface? default method is a method that has a body and can be called on an instance of the interface. It allows us to add new methods to an interface without breaking the existing implementation of the interface. This is useful for maintaining backward compatibility when we want to add new functionality to an interface without affecting the classes that already implement it.

  static void numberOfWheels() {
    System.out.println("Number of wheels: 4");
  }
}

class NewCar implements NewCarInterface {
    public void start() {
        System.out.println("New car is starting...");
    }
    
    public void numberOfGears() {
        System.out.println("Number of gears: 6");
    }

    @Override
    public void airBags() {
        System.out.println("Airbags are present: 7");
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
        // Manual manualCar = new Manual();
        // manualCar.start();
        // manualCar.noise();
        // ManualINT manualINT = new ManualINT();
        // manualINT.start();
        // AutomaticCar automaticCar = new AutomaticCar();
        // automaticCar.start();

        NewCar newCar = new NewCar();
        newCar.start();
        newCar.numberOfGears();
        newCar.airBags();
    }
}
