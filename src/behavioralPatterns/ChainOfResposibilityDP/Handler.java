package behavioralPatterns.ChainOfResposibilityDP;

//Declares method to handle requests and reference to the next handler
public abstract class Handler {
    protected Handler nextHandler;

    public void setNextHandler(Handler nextHandler) {
        this.nextHandler = nextHandler;
    }

    public abstract void handle(String request);
}
