package creationalPatterns.FactoryMethodDP;

public class EmailNotification implements Notification {
    @Override
    public String notifyUser() {
        return "Email notification sent";
    }
}
