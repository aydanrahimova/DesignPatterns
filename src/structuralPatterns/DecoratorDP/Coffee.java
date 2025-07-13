package structuralPatterns.DecoratorDP;

//Component interface - common interface for both-the concrete components and decorators
public interface Coffee {
    String getDescription();

    double getPrice();
}
