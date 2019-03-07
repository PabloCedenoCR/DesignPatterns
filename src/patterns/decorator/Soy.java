package patterns.decorator;

public class Soy extends CondimentDecorator {

  private static final double COST = .15;

  public Soy(Beverage beverage) {
    this.beverage = beverage;
    this.size = beverage.size;
  }

  @Override
  public double cost() {
    return getCostBySize() + beverage.cost();
  }

  @Override
  public String getDescription() {
    return beverage.getDescription() + " and Soy";
  }

  @Override
  double getCostBySize() {
    return COST * (beverage.size.ordinal() + 1);
  }
}
