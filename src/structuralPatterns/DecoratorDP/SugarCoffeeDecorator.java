package structuralPatterns.DecoratorDP;

public class SugarCoffeeDecorator extends CoffeeDecorator {
    public SugarCoffeeDecorator(Coffee decoratedCoffee) {
        super(decoratedCoffee);
    }

    @Override
    public double getPrice() {
        return decoratedCoffee.getPrice() + 0.2;
    }

    @Override
    public String getDescription() {
        return decoratedCoffee.getDescription() + " with Sugar";
    }
}
