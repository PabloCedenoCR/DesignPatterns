package patterns.decorator;

public abstract class CondimentDecorator extends Beverage {

  protected Beverage beverage;

  abstract double getCostBySize();
}
