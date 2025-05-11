package creationalPatterns.FactoryMethodDP;

public class SMSNotification implements Notification {
    @Override
    public String notifyUser() {
        return "SMS notification sent";
    }
}
