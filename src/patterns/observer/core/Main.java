package patterns.observer.core;

public class Main {

  public static void main(String[] args) throws InterruptedException {
    Observer observer1 = new Observer();
    Observer observer2 = new Observer();
    Observer observer3 = new Observer();

    Subject subject = new Subject();
    new ForecastDisplay(subject);

    System.out.println("Step 1 completed");

    Thread.sleep(50000L);
    subject.deleteObserver(observer1);
    System.out.println("Step 2 completed");

    Thread.sleep(50000L);
    subject.deleteObserver(observer2);
    System.out.println("Step 3 completed");

    Thread.sleep(50000L);
    subject.deleteObserver(observer3);
    System.out.println("Step 4 completed");

    Thread.sleep(50000L);
    subject.addObserver(observer1);
    Thread.sleep(10000L);
    System.out.println("Step 5 completed");

    System.exit(1);
  }
}
