import java.util.Scanner;

public class Main
{
	public static void main(String[] args)  {
		Scanner in = new Scanner(System.in); //assigns a new variable for input "in"
	    System.out.println("Enter the weight of your package: "); //prints an input prompt
	    double inputWeight = in.nextDouble(); //assigns inputWeight to "in"
		double price = 0; //assigns price to 0 to allow for addition
    
    if (inputWeight > 0 && inputWeight < 20) { 	//first conditional statement, if inputWeight is between 0 and 20, run the program.	
    		if (inputWeight >= 0.0 && inputWeight <= 2.0) { //if inputWeight is between 0 and 2, assign 2.5 to price and print the price.
    		    price += 2.50; //price = price + 2.50
    		    System.out.println("Your price is £" + price); //prints the price
    	}	else if (inputWeight >= 2.0 && inputWeight < 4.0) { //if inputWeight is between 2 and 4, assign 4.5 to price and print the price.
    		    price += 4.50; //price = price + 4.50
    		    System.out.println("Your price is £" + price); //prints the price
    	}	else if (inputWeight >= 4.0 && inputWeight < 10.0) { //if inputWeight is between 4 and 10, assign 7.5 to price and print the price.
    		    price += 7.50;  //price = price + 7.50
    		    System.out.println("Your price is £" + price); //prints the price
    	  }	else if (inputWeight >= 10 && inputWeight < 20) { //if inputWeight is between 10 and 20, assign 10.5 to price and print the price.
    	        price += 10.50; //price = price + 10.50
    	        System.out.println("Your price is £" + price); //prints the price
    	  }
          else: 
            System.out.println("Please enter a valid weight."); //if inputWeight is not between 0 and 20, print this message.
        }
    }
}
