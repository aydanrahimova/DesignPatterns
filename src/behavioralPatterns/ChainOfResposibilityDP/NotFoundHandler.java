package behavioralPatterns.ChainOfResposibilityDP;

public class NotFoundHandler extends Handler {
    @Override
    public void handle(String request) {
        if (request.equals("not found")) {
            System.out.println("NotFoundHandler handles the request");
        } else if (request != null) {
            nextHandler.handle(request);
        }
    }
}
