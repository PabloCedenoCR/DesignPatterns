package patterns.observer;

public class ObserverImpl implements Observer<Integer> {
  @Override
  public void update(Integer value) {
    System.out.println("**** " + this.hashCode() + " - State: " + value);
  }
}
