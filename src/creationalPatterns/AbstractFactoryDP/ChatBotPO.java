package creationalPatterns.AbstractFactoryDP;

public class ChatBotPO implements ProductOwner {
    @Override
    public void manageProject() {
        System.out.println("I am managing chatbot...");
    }
}
