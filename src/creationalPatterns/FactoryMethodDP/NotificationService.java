package creationalPatterns.FactoryMethodDP;

public class NotificationService {
    NotificationFactory factory;

    public NotificationService(NotificationFactory factory) {
        this.factory = factory;
    }

    public String sendNotification(String type) {
        Notification notification = factory.createNotification();
        return notification.notifyUser();
    }

}
