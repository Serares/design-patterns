package decorator;

public class Soy extends CondimentDecorator {
    Beverage beverage;

    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }

    public String getDescription() {
        return beverage.getDescription() + " Soy";
    }

    @Override
    public double cost() {
        Double cost = beverage.cost();
        if(this.getSize() == Size.VENTI) {
            cost += .10;
        }else if (this.getSize() == Size.TALL){
            cost += .15;
        }else if (this.getSize() == Size.GRANDE){
            cost += .20;
        }
        return cost;
    }
}
