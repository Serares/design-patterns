package decorator;

public class Starbuzz {
    public static void main(String[] args) {
        Beverage beverage = new Espresso();
        System.out.println(beverage.getDescription() + " $ " + beverage.cost());

        Beverage beverage2 = new DarkRoast();
        // TODO figure out how to set the size of the beverage
        beverage2.setSize(Beverage.Size.VENTI);
        beverage2 = new Mocha(beverage2);
        beverage2 = new Soy(beverage2);
        beverage2 = new Whip(beverage2);
        System.out.println(beverage2.getDescription() + " $ " + beverage2.cost() + " Size: " + beverage2.getSize());

    }
}
