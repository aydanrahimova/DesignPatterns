package behavioralPatterns.ObserverDP;

public class EmailSubscriber implements Observer {
    private String news;

    @Override
    public void update(String news) {
        this.news = news;
        display(news);
    }

    private void display(String news) {
        System.out.println("News sent to email " + news);
    }
}
