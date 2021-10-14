package cafeteriadecorator;

public class DarkRoast extends Beverage {
    
    public DarkRoast(){
        description = "Café Dark Roast";
    }
    @Override
    public double cost() {
        return 0.99;
    }
    
}