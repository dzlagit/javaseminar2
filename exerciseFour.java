import java.util.Scanner;

public class Main
{
	public static void main(String[] args)  {
	    Scanner in = new Scanner(System.in); //assigns a new variable for input "in"
	    System.out.println("Enter a single character: "); //prints an input prompt
	    String inputChar = in.nextLine(); //assigns inputChar to "in"
	    
	    if (inputChar.length() == 1) { //if inputChar is one character, run the program.
	        char character = inputChar.charAt(0); //assigns character to inputChar
	        int asciiConversion = (int) character; //assigns asciiConversion to character
	            System.out.println("The ASCII code for character " + character + " is " + asciiConversion + "."); //prints the results
	   }    else {
	            System.out.println("Enter one character."); //if inputChar is not one character, print this message.
	   }
	}
}
