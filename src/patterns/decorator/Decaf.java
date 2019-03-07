package patterns.decorator;

public class Decaf extends Beverage {

  public Decaf(Size size) {
    this.size = size;
  }

  @Override
  public String getDescription() {
    return "I'm a decaf coffee";
  }

  @Override
  public double cost() {
    return 1.05 * (size.ordinal() + 1);
  }
}
