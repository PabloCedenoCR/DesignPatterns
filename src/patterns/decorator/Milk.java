package patterns.decorator;

public class Milk extends CondimentDecorator {

  private static final double COST = .1;

  public Milk(Beverage beverage) {
    this.beverage = beverage;
    this.size = beverage.size;
  }

  @Override
  public double cost() {
    return getCostBySize() + beverage.cost();
  }

  @Override
  public String getDescription() {
    return beverage.getDescription() + " and Milk";
  }

  @Override
  double getCostBySize() {
    return COST * (beverage.size.ordinal() + 1);
  }
}
