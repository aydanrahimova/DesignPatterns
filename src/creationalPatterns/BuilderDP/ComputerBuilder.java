package creationalPatterns.BuilderDP;

public class ComputerBuilder {
    private String ram;
    private String memory;
    private String CPU;
    private String GPU;
    private String displayInch;
    private String camera;
    private Boolean hasTouchScreen;
    private Boolean hasNumericKeyboard;

    private ComputerBuilder() {
    }

    public static ComputerBuilder builder() {
        return new ComputerBuilder();
    }

    public ComputerBuilder ram(String ram) {
        this.ram = ram;
        return this;
    }

    public ComputerBuilder memory(String memory) {
        this.memory = memory;
        return this;
    }

    public ComputerBuilder CPU(String CPU) {
        this.CPU = CPU;
        return this;
    }

    public ComputerBuilder GPU(String GPU) {
        this.GPU = GPU;
        return this;
    }

    public ComputerBuilder displayInch(String displayInch) {
        this.displayInch = displayInch;
        return this;
    }

    public ComputerBuilder camera(String camera) {
        this.camera = camera;
        return this;
    }

    public ComputerBuilder hasTouchScreen(Boolean hasTouchScreen) {
        this.hasTouchScreen = hasTouchScreen;
        return this;
    }

    public ComputerBuilder hasNumericKeyboard(Boolean hasNumericKeyboard) {
        this.hasNumericKeyboard = hasNumericKeyboard;
        return this;
    }

    public Computer build() {
        return new Computer(ram, memory, CPU, GPU, displayInch, camera, hasTouchScreen, hasNumericKeyboard);
    }
}
