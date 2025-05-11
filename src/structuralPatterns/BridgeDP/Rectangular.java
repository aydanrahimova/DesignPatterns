package structuralPatterns.BridgeDP;

public class Rectangular extends Shape {
    public Rectangular(Color c) {
        super(c);
    }

    @Override
    public void applyColor() {
        System.out.print("Rectangular filled with color ");
        color.applyColor();
    }
}
