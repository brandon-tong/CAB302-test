import java.util.ArrayList;
import java.util.Objects;

public class AuthenticationService implements IAuthenticationService {
    private ArrayList<User> users;

    public AuthenticationService(ArrayList<User> users) {
        this.users = users;
    }
    @Override
    public User signUp(String username, String password) {
        for ( User user : users ) {
            if (user.getUsername().equals(username))
                return null;
        }
        User newUser = new User(username, password);
        users.add(new User(username, password));
        return newUser;
    }

    @Override
    public User logIn(String username, String password) {
        for ( User user : users ) {
            if (user.getUsername().equals(username)) {
                return user.getPassword().equals(password) ? user : null;
            }
        }
        return null;
    }
}
