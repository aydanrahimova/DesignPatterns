package creationalPatterns.BuilderDP;

public class Computer {
    private String ram;
    private String memory;
    private String CPU;
    private String GPU;
    private String displayInch;

    public Computer(String ram, String memory, String CPU, String GPU, String displayInch, String camera, Boolean hasTouchScreen, Boolean hasNumericKeyboard) {
        this.ram = ram;
        this.memory = memory;
        this.CPU = CPU;
        this.GPU = GPU;
        this.displayInch = displayInch;
        this.camera = camera;
        this.hasTouchScreen = hasTouchScreen;
        this.hasNumericKeyboard = hasNumericKeyboard;
    }

    private String camera;
    private Boolean hasTouchScreen;
    private Boolean hasNumericKeyboard;

    public String getRam() {
        return ram;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }

    public String getMemory() {
        return memory;
    }

    public void setMemory(String memory) {
        this.memory = memory;
    }

    public String getCPU() {
        return CPU;
    }

    public void setCPU(String CPU) {
        this.CPU = CPU;
    }

    public String getGPU() {
        return GPU;
    }

    public void setGPU(String GPU) {
        this.GPU = GPU;
    }

    public String getDisplayInch() {
        return displayInch;
    }

    public void setDisplayInch(String displayInch) {
        this.displayInch = displayInch;
    }

    public String getCamera() {
        return camera;
    }

    public void setCamera(String camera) {
        this.camera = camera;
    }

    public Boolean getHasTouchScreen() {
        return hasTouchScreen;
    }

    public void setHasTouchScreen(Boolean hasTouchScreen) {
        this.hasTouchScreen = hasTouchScreen;
    }

    public Boolean getHasNumericKeyboard() {
        return hasNumericKeyboard;
    }

    public void setHasNumericKeyboard(Boolean hasNumericKeyboard) {
        this.hasNumericKeyboard = hasNumericKeyboard;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "ram='" + ram + '\'' +
                ", memory='" + memory + '\'' +
                ", CPU='" + CPU + '\'' +
                ", GPU='" + GPU + '\'' +
                ", displayInch='" + displayInch + '\'' +
                ", camera='" + camera + '\'' +
                ", hasTouchScreen=" + hasTouchScreen +
                ", hasNumericKeyboard=" + hasNumericKeyboard +
                '}';
    }
}
