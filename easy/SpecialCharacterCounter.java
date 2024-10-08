import java.util.Scanner;

public class SpecialCharacterCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a line of text: ");
        String input = scanner.nextLine();
        String specialCharacters = "";
        int count = 0;
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (!Character.isLetterOrDigit(ch) && !Character.isWhitespace(ch)) {
                specialCharacters += ch;
                count++;
            }
        }
        System.out.println("Special characters: " + specialCharacters);
        System.out.println("Number of special characters: " + count);

        scanner.close();
    }
}
