package patterns.decorator;

public class Espresso extends Beverage {

  public Espresso(Size size) {
    this.size = size;
  }

  @Override
  public String getDescription() {
    return "I'm a espresso coffee";
  }

  @Override
  public double cost() {
    return 1.99 * (size.ordinal() + 1);
  }
}
