package creationalPatterns.FactoryDP;

public class EmailMessage implements Message {
    @Override
    public void sendMessage() {
        System.out.println("Email message sent");
    }

}
