package creationalPatterns.FactoryMethodDP;

public class EmailNotification implements Notification {
    @Override
    public void notifyUser() {
        System.out.println("Email notification sent");
    }
}
