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


// a class can implement multiple interfaces but can only extend one class. This is because Java does not support multiple inheritance of classes, but it does support multiple inheritance of interfaces. By implementing multiple interfaces, a class can inherit the abstract methods from all the interfaces and provide implementations for them, allowing for more flexible and modular code design.
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

//can interfaces extend other interfaces ? yes, interfaces can extend other interfaces in Java. This allows for the creation of more specialized interfaces that inherit the abstract methods of the parent interface. When an interface extends another interface, it can add new abstract methods or override existing ones. A class that implements the child interface must provide implementations for all the abstract methods from both the child and parent interfaces.


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

// static

class BankAccount {
    private static int accountNumber = 1000;

    public static void generateAccountNumber() {
        accountNumber++;
        System.out.println("Generated Account Number: " + accountNumber);
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

        // NewCar newCar = new NewCar();
        // newCar.start();
        // newCar.numberOfGears();
        // newCar.airBags();

        BankAccount bankAccount1 = new BankAccount();
        BankAccount bankAccount2 = new BankAccount();
        BankAccount.generateAccountNumber(); // Output: Generated Account Number: 1001
        BankAccount.generateAccountNumber(); // Output: Generated Account Number: 1002
    }
}
