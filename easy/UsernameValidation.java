import java.util.Scanner;
public class UsernameValidation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter username: ");
        String username = scanner.nextLine();

        if (isValidUsername(username)) {
            System.out.println("Username is valid.");
        } else {
            System.out.println("Username is invalid.");
        }
        scanner.close();
    }
    public static boolean isValidUsername(String username) {
        if (username.length() >= 4 && username.length() <= 12 && !username.contains(" ")) {
            return true;
        }
        return false;
    }
}