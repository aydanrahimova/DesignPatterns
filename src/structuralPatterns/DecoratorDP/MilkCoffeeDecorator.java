package structuralPatterns.DecoratorDP;

public class MilkCoffeeDecorator extends CoffeeDecorator {
    public MilkCoffeeDecorator(Coffee decoratedCoffee) {
        super(decoratedCoffee);
    }

    @Override
    public double getPrice() {
        return decoratedCoffee.getPrice() + 0.5;
    }

    @Override
    public String getDescription() {
        return decoratedCoffee.getDescription() + " with Milk";
    }
}
