package behavioralPatterns.ChainOfResposibilityDP;

public class AuthHandler extends Handler {
    @Override
    public void handle(String request) {
        if (request.equals("auth")) {
            System.out.println("AuthHandler handles request");
        } else if (request != null) {
            nextHandler.handle(request);
        }
    }
}
