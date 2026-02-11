// Liskov Substitution principle(LSP)

class Notification {
    public void sendNotification() {
        System.out.println("Email send");
    }
}

class TextNotification extends Notification {
    @Override
    public void sendNotification() {
        System.out.println("Text");
    }
}

class WaNotification extends Notification {
    @Override
    public void sendNotification() {
        System.out.println("Whatsapp");
    }
}

//this example below violated isp
//interface Uber {
//    void bookRide();
//    void acceptRide();
//    void drive();
//    void endRide();
//    void payRide();
//}

interface RiderInterface {
    void acceptRide();
    void drive();
    void endRide();
}

interface DriverInterface {
    void acceptRide();
    void drive();
    void endRide();
}

class Drive implements  DriverInterface {
    public void acceptRide(){
        System.out.println("Accept ride");
    }
    public void drive(){
        System.out.println("Drive");
    }
    public void endRide(){
        System.out.println("End ride");
    }
}

// Dependency Inversion principle
// HL modules should not depend on ll modules both should depend on abstraction. Abstraction should depend on details. Details should depend on abstractions
interface RecommendationStrategy {
    void recommend();
}

class TredingRecommendations implements RecommendationStrategy {
    public void recommend() {
    }
}

class RecommendationAlgorithm {
    private RecommendationStrategy recommendationStrategy;
    public RecommendationAlgorithm(RecommendationStrategy recommendationStrategy) {
        this.recommendationStrategy = recommendationStrategy;
    }

    public void recommend() {
        recommendationStrategy.recommend();
    }
}

class app{
  public static void main(String [] args){
        Notification notification = new WaNotification();
        Drive drive = new Drive();
        notification.sendNotification();

        // Interface segregation principle(ISP)
        drive.acceptRide();
        drive.drive();
        drive.endRide();
  }
}
