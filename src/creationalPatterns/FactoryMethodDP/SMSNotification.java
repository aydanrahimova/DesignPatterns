package creationalPatterns.FactoryMethodDP;

public class SMSNotification implements Notification {
    @Override
    public void notifyUser() {
        System.out.println("SMS sent");
    }
}
