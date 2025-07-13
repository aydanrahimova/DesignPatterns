package structuralPatterns.ProxyDP;

//Real Subject
public class RealImage implements Image {

    private String fileName;

    public RealImage(String fileName) {
        this.fileName = fileName;
        loadFromDisk();//expensive operation
    }

    private void loadFromDisk() {
        System.out.println("Image is loading from disk...");
    }

    @Override
    public void display() {
        System.out.println("Real image displays");
    }
}
