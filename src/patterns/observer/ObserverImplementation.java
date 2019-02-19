package patterns.observer;

public class ObserverImplementation implements Observer<Integer> {
  @Override
  public void update(Integer value) {
    System.out.println("**** " + this.hashCode() + " - State: " + value);
  }
}
