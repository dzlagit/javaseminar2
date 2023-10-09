import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // Create a Scanner object

        System.out.print("Enter the long string: "); // Prompt user for long string
        String longString = input.nextLine(); // Read user input

        System.out.print("Enter the short string: "); // Prompt user for short string
        String shortString = input.nextLine(); // Read user input

        if (longString.length() == 2 && shortString.length() == 2) { // Check if strings are two characters long
            if (longString.contains(shortString)) { // Check if short string is a substring of long string
                System.out.println(shortString + " is a substring of " + longString); // Print if short string is a substring of long string
            } else {
                System.out.println(shortString + " is not a substring of " + longString); // Print if short string is not a substring of long string
            }
        }   else {
            System.out.println("Your strings are longer than two characters."); // Print if strings are longer than two characters
        }
    }
}
