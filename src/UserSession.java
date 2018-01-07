public class UserSession {

    private UserManager um;

    public UserSession(UserManager um) {
        this.um = um;
    }

    public void start(String username) {

    }

    public boolean isUserValid(String username) {
        return um.isUserValid(username);
    }
}
