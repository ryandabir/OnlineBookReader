import java.util.GregorianCalendar;

public class Admin extends User{

    public Admin(String usernameInput, Name nameInput, GregorianCalendar expirationDateInput, boolean activeInput) {
        super(usernameInput, nameInput, expirationDateInput, activeInput);
    }

}
