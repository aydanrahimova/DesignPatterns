package structuralPatterns.DecoratorDP;

//Concrete Component
public class PlainCoffee implements Coffee {
    @Override
    public String getDescription() {
        return "Plain Coffee";
    }

    @Override
    public double getPrice() {
        return 5.0;
    }
}
