import java.util.Scanner;
public class Main
{
	public static void main(String[] args)  {
		Scanner input = new Scanner(System.in); //creates a new var for input
		System.out.println("Enter your first number: "); //prints input prompt
		int numberOne = input.nextInt(); //assigns numberOne to input
		Scanner number2 = new Scanner(System.in); //creats a new var for input
		System.out.println("Enter your second number: "); //prints input prompt
		int numberTwo = input.nextInt(); //assigns numberTwo to input
		
		System.out.println(numberOne + numberTwo); //prints the results of numbers
	}
}
