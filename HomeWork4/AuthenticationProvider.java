package task3;

public interface AuthenticationProvider {
    User getUser(String username);

    boolean isUserAuthenticated(String username, String password);
}
