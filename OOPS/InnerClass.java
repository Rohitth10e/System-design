package OOPS;

// any java class which is defined inside outside class
// static nested, non static nested, local inner, anonymous inner class


// static access only static members , no instance of outer class
class OuterClass {
    static int val = 10;
    String name = "Outer class";

    static class InnerStaticClass{
        public void execute() {
            System.out.println("Inner class executed");
        }
    }

    public void execute(){
        InnerStaticClass innerStaticClass = new InnerStaticClass();
        innerStaticClass.execute();
    }
}

// non static inner class

public class InnerClass {
    public static void main(String[] args) {
//        OuterClass.InnerStaticClass innerStaticClass = new OuterClass.InnerStaticClass();
//        innerStaticClass.execute();
    }
}
