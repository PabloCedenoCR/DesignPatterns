package patterns.observer;

public class Main {

  public static void main(String[] args) throws InterruptedException {
    Observer observer1 = new ObserverImpl();
    Observer observer2 = new ObserverImpl();
    Observer observer3 = new ObserverImpl();

    Subject subject = new SubjectImpl();
    subject.registerObserver(observer1);
    subject.registerObserver(observer2);
    subject.registerObserver(observer3);
    System.out.println("Step 1 completed");

    Thread.sleep(50000L);
    subject.removeObserver(observer1);
    System.out.println("Step 2 completed");

    Thread.sleep(50000L);
    subject.removeObserver(observer2);
    System.out.println("Step 3 completed");

    Thread.sleep(50000L);
    subject.removeObserver(observer3);
    System.out.println("Step 4 completed");

    Thread.sleep(50000L);
    subject.registerObserver(observer1);
    Thread.sleep(10000L);
    System.out.println("Step 5 completed");

    System.exit(1);
  }
}
