package patterns.decorator;

public class HouseBlend extends Beverage {

  public HouseBlend(Size size) {
    this.size = size;
  }

  @Override
  public String getDescription() {
    return "I'm a house blend coffee";
  }

  @Override
  public double cost() {
    return .89 * (size.ordinal() + 1);
  }
}
