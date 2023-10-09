import java.util.Scanner;
public class Main 
{
	public static void main(String[] args) {
    double a = 0; // Area
    Scanner input = new Scanner(System.in); // Create a Scanner object
    System.out.println("What is the length of the side of your hexagon? "); // Prompt user for length of side of hexagon
    double s = input.nextInt(); // Read user input
    a = (6 * (s * s)) / (4 * Math.tan(Math.PI / 6)); // Calculate area of hexagon
    System.out.println("Your area is: " + a); // Print area of hexagon
    }
}
