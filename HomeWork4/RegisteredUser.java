package task3;

public class RegisteredUser extends User {
    private int id;

    public RegisteredUser(String username, String password, String email, int id) {
        super(username, password, email);
        this.id = id;
    }

    public int getId() {
        return id;
    }

    @Override
    public void displayUserInfo() {
        System.out.println("Registered User Info:");
        System.out.println("Username: " + getUsername());
        System.out.println("Email: " + getEmail());
        System.out.println("ID: " + getId());
    }
}