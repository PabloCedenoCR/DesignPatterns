package patterns.decorator;

public class Mocha extends CondimentDecorator {

  private static final double COST = .2;

  public Mocha(Beverage beverage) {
    this.beverage = beverage;
    this.size = beverage.size;
  }

  @Override
  public double cost() {
    return getCostBySize() + beverage.cost();
  }

  @Override
  public String getDescription() {
    return beverage.getDescription() + " and Mocha";
  }

  @Override
  double getCostBySize() {
    return COST * (beverage.size.ordinal() + 1);
  }
}
