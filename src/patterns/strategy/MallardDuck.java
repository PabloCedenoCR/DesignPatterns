package patterns.strategy;

public class MallardDuck extends Duck {

  public MallardDuck() {
    flyBehavior = new FlyWithWIngs();
    quackBehavior = new Quack();
  }

  @Override
  void display() {
    System.out.println("I'm a Mallard Duck");
  }
}
