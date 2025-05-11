package structuralPatterns.AdapterDP;

public class MyGov {
    private String fullName;
    private String fin;
    private String dateOfBirth;

    public MyGov(String fullName, String fin, String dateOfBirth) {
        this.fullName = fullName;
        this.fin = fin;
        this.dateOfBirth = dateOfBirth;
    }


    public String getFullName() {
        return fullName;
    }

    public String getFin() {
        return fin;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }
}
