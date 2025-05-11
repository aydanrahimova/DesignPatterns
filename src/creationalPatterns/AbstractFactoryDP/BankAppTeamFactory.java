package creationalPatterns.AbstractFactoryDP;

public class BankAppTeamFactory implements TeamFactory {
    @Override
    public Developer createDeveloper() {
        return new JavaDeveloper();
    }

    @Override
    public ProductOwner createProductOwner() {
        return new BankAppPO();
    }
}
