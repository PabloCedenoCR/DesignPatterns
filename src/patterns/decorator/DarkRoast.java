package patterns.decorator;

public class DarkRoast extends Beverage {

  public DarkRoast(Size size) {
    this.size = size;
  }

  @Override
  public String getDescription() {
    return "I'm a dark roast coffee";
  }

  @Override
  public double cost() {
    return .99 * (size.ordinal() + 1);
  }
}
