package creationalPatterns.Prototype;

public class Passport implements Copyable {
    private String fin;

    public Passport(String fin) {
        this.fin = fin;
    }

    public String getFin() {
        return fin;
    }

    public void setFin(String fin) {
        this.fin = fin;
    }

    @Override
    public Object deepCopy() {
        return new Passport(this.fin);
    }

    @Override
    public Object shallowCopy() {
        return new Passport(this.fin);
    }

    @Override
    public String toString() {
        return "Passport{fin='" + fin + "'}";
    }
}
