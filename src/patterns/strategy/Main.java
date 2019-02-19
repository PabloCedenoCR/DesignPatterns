package patterns.strategy;

public class Main {

  public static void main(String[] args) {
    Duck mallardDuck = new MallardDuck();
    Duck decoyDuck = new DecoyDuck();

    mallardDuck.display();
    mallardDuck.performFly();
    mallardDuck.performQuack();
    mallardDuck.setQuackBehavior(new MuteQuack());
    mallardDuck.performFly();
    mallardDuck.performQuack();

    decoyDuck.display();
    decoyDuck.performFly();
    decoyDuck.performQuack();
    decoyDuck.setFlyBehavior(new FlyWithWIngs());
    decoyDuck.performFly();
    decoyDuck.performQuack();
  }
}
