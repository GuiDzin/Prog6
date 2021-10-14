package cafeteriadecorator;

public class HouseBlend extends Beverage {
    
    public HouseBlend(){
        description = "Café House Blend";
    }
    @Override
    public double cost() {
        return 0.89;
    }
    
}