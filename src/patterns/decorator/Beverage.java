package patterns.decorator;

public abstract class Beverage implements Costable, Describable {

  public enum Size {
    TALL,
    GRANDE,
    VENTI;
  }

  protected Size size;
}
