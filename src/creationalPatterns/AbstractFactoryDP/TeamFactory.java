package creationalPatterns.AbstractFactoryDP;

public interface TeamFactory {
    Developer createDeveloper();

    ProductOwner createProductOwner();
}
