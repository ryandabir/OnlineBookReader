import java.util.GregorianCalendar;
import java.util.HashMap;

public class UserManager {

    private HashMap<String, User> userList = new HashMap<>();

    public UserManager() {}

    public void addUser(String username, Name name, GregorianCalendar expirationDate, boolean active) {
        if(userList.containsKey(username)) {
            System.out.println("User already exists.");
        }
        else {
            User user = new User(username, name, expirationDate, active);
            userList.put(username, user);
        }
    }

    public void deleteUser(String username) {
        if(userList.containsKey(username)) {
            userList.remove(username);
        }
        else {
            System.out.println("User does not exist, cannot delete.");
        }
    }

    public boolean isUserValid(String username) {
        if(userList.containsKey(username)) {
            return true;
        }
        return false;
    }
}
