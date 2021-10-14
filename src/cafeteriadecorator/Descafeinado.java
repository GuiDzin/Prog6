package cafeteriadecorator;

public class Descafeinado extends Beverage {
    
    public Descafeinado(){
        description = "Descafeinado";
    }
    @Override
    public double cost() {
        return 1.05;
    }
    
}