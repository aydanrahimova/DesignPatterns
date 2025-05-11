package creationalPatterns.Prototype;

public class User implements Copyable,Cloneable {
    private String name;
    private String surname;
    private Passport passport;

    public User(String name, String surname, Passport passport) {
        this.name = name;
        this.surname = surname;
        this.passport = passport;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Passport getPassport() {
        return passport;
    }

    public void setPassport(Passport passport) {
        this.passport = passport;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", passport=" + passport +
                '}';
    }

    @Override
    public Object deepCopy() {
        return new User(this.name, this.surname, (Passport) this.passport.deepCopy());
    }

    @Override
    public Object shallowCopy() {
        return new User(this.name, this.surname, this.passport); // same passport reference
    }


    @Override
    public User clone() {
        try {
            User clone = (User) super.clone();
            // TODO: copy mutable state here, so the clone can't change the internals of the original
            return clone;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}
