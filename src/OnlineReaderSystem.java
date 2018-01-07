import java.util.Scanner;

public class OnlineReaderSystem {

    public static void main(String[] args) {

        String username = "";
        Boolean validUser;
        UserManager um = new UserManager();
        UserSession session = new UserSession(um);

        while(true) {
            System.out.println("Enter your username: ");
            Scanner scanner = new Scanner(System.in);
            username = scanner.nextLine();
            validUser = session.isUserValid(username);

            if(validUser) {
                session.start(username);
                System.exit(0);
            }
        }
    }
}
