import java.util.GregorianCalendar;

public class User {

    private Name name;
    private GregorianCalendar expirationDate;
    private boolean active;

    public User(Name NameInput, GregorianCalendar expirationDateInput, boolean activeInput) {
        name = NameInput;
        expirationDate = expirationDateInput;
        active = activeInput;
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
