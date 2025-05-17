package structuralPatterns.FacadeDP;

public class UserRegistrationFacade {
    private final UserValidator validator;
    private final UserRepository repository;
    private final EmailService emailService;

    public UserRegistrationFacade(UserValidator validator, UserRepository repository, EmailService emailService) {
        this.validator = validator;
        this.repository = repository;
        this.emailService = emailService;
    }

    public void registerUser(String email, String password) {
        if (validator.isValid(email, password)) {
            repository.saveUser(email);
            emailService.sendWelcomeEmail(email);
            System.out.println("User successfully registered");
        } else {
            System.out.println("Invalid inputs");
        }
    }
}
