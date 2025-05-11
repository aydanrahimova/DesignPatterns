package creationalPatterns.AbstractFactoryDP;

public class BankAppPO implements ProductOwner {
    @Override
    public void manageProject() {
        System.out.println("I am managing bank app...");
    }
}
