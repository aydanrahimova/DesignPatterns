package creationalPatterns.FactoryDP;

public class SMSMessage implements Message {
    @Override
    public void sendMessage() {
        System.out.println("SMS sent");
    }
}
