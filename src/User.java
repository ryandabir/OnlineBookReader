import java.util.GregorianCalendar;

public class User {

    private Name name;
    private GregorianCalendar expirationDate;
    private boolean active;
    private String username;


    public User(String usernameInput, Name nameInput, GregorianCalendar expirationDateInput, boolean activeInput) {
        username = usernameInput;
        name = nameInput;
        expirationDate = expirationDateInput;
        active = activeInput;
    }

    public String getUserName() {
        return username;
    }

    public String getFirstName() {
        return name.getFirst();
    }

    public String getMiddletName() {
        return name.getMiddle();
    }

    public String getLastName() {
        return name.getLast();
    }

    public GregorianCalendar getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(GregorianCalendar dateInput) {
        expirationDate = dateInput;
    }

    public boolean isActive() {
        return active;
    }

    public void enableUser() {
        active = true;
    }

    public void disableUser() {
        active = false;
    }
}
