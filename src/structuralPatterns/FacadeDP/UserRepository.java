package structuralPatterns.FacadeDP;

public class UserRepository {
    public void saveUser(String email){
        System.out.println("Saving user with email "+ email+ " in db...");
    }
}
