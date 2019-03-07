package patterns.decorator;

public class Whip extends CondimentDecorator {

  private static final double COST = .1;

  public Whip(Beverage beverage) {
    this.beverage = beverage;
    this.size = beverage.size;
  }

  @Override
  public double cost() {
    return getCostBySize() + beverage.cost();
  }

  @Override
  public String getDescription() {
    return beverage.getDescription() + " and Whip";
  }


  @Override
  double getCostBySize() {
    return COST * (beverage.size.ordinal() + 1);
  }
}
