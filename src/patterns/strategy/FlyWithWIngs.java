package patterns.strategy;

public class FlyWithWIngs implements FlyBehavior {

  @Override
  public void fly() {
    System.out.println("Fly with wings");
  }
}
