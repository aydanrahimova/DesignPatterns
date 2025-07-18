package structuralPatterns.BridgeDP;

public abstract class Shape {

    //Composition-implementor
    protected Color color;

    public Shape(Color c) {
        this.color = c;
    }

    abstract public void applyColor();
}
