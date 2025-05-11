package creationalPatterns.FactoryDP;

public class MessageFactory {
    public static Message createNotificationByType(String type) {
        return switch (type) {
            case "SMS" -> new SMSMessage();
            case "Email" -> new EmailMessage();
            default -> null;
        };
    }
}
