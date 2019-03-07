package patterns.decorator;

public class Main {

  public static void main(String[] args) {
    Beverage beverage;

//    beverage = new HouseBlend(Beverage.Size.TALL);
//    printDetails(beverage);
//    beverage = new Mocha(beverage);
//    printDetails(beverage);
//    beverage = new Mocha(beverage);
//    printDetails(beverage);
//    beverage = new Soy(beverage);
//    printDetails(beverage);
//    beverage = new Whip(beverage);
//    printDetails(beverage);

//    beverage = new Decaf(Beverage.Size.TALL);
//    printDetails(beverage);
//    beverage = new Mocha(beverage);
//    printDetails(beverage);
//    beverage = new Mocha(beverage);
//    printDetails(beverage);
//    beverage = new Soy(beverage);
//    printDetails(beverage);
//    beverage = new Whip(beverage);
//    printDetails(beverage);

//    beverage = new DarkRoast(Beverage.Size.TALL);
//    printDetails(beverage);
//    beverage = new Mocha(beverage);
//    printDetails(beverage);
//    beverage = new Mocha(beverage);
//    printDetails(beverage);
//    beverage = new Soy(beverage);
//    printDetails(beverage);
//    beverage = new Whip(beverage);
//    printDetails(beverage);

    beverage = new Espresso(Beverage.Size.GRANDE);
    printDetails(beverage);
    beverage = new Mocha(beverage);
    printDetails(beverage);
    beverage = new Mocha(beverage);
    printDetails(beverage);
    beverage = new Soy(beverage);
    printDetails(beverage);
    beverage = new Whip(beverage);
    printDetails(beverage);
  }

  private static void printDetails(Beverage beverage) {
    System.out.println(beverage.getDescription());
    System.out.println(beverage.cost());
    System.out.println("********************************");
  }
}
