package structuralPatterns.FacadeDP;

public class UserValidator {
    public boolean isValid(String email,String password){
        System.out.println("Validating email and password...");
        return email.contains("@") && password.length() >= 6;
    }
}
