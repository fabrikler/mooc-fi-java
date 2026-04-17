import java.util.Scanner;
import java.util.ArrayList;

public class Login {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> users = new ArrayList<>();
        ArrayList<String> passwords = new ArrayList<>();

        users.add("alex");
        users.add("emma");
        passwords.add("sunshine");
        passwords.add("haskell");

        System.out.println("Enter username:");

        String userName = scanner.nextLine();

        System.out.println("Enter password:");

        String userPassword = scanner.nextLine();

        boolean isTrue = passwordChecker(users, passwords, userName, userPassword);

        if (isTrue) {
            System.out.println("You have successfully logged in!");
        } else {
            System.out.println("Incorrect username or password!");
        }

    }

    public static boolean passwordChecker(ArrayList<String> users, ArrayList<String> passwords, String userName,
            String userPassword) {
        for (int i = 0; i < users.size(); i++) {
            if (userName.equals(users.get(i)) && userPassword.equals(passwords.get(i))) {
                return true;
            }
        }
        return false;

    }
}
