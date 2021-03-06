package cafeteriadecorator;

public class Whip extends CondimentDecorator {
    
    Beverage beverage;
    
    public Whip(Beverage beverage){
        this.beverage = beverage;
    }
           
    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Creme";
    }

    @Override
    public double cost() {
        return 0.10 + beverage.cost();
    }
    
}