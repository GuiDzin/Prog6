package cafeteriadecorator;

public class Milk extends CondimentDecorator {
    
    Beverage beverage;
    
    public Milk(Beverage beverage){
        this.beverage = beverage;
    }
           
    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Leite com Espuma";
    }

    @Override
    public double cost() {
        return 0.1 + beverage.cost();
    }
    
}