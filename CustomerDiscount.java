import java.util.Scanner;
import java.text.DecimalFormat;

/**
 * Laura Davis CIS 260 903
 * This program determines which category a customer fits into
 * to determine the discount they receive and will calculate
 * the final price of an ordered item with tax and discount.
 */

public class CustomerDiscount 
{
	public static void main(String [] args)
	{
		//declare variables
		final double TAX_RATE = 0.07;
		final double A = 0.2, B = 0.1, C = 0.05, D = 0.0;
		double discount;
		double itemPrice = 20.00;
		double subtotal;
		double total;
		double tax;
		String customer;
		
		//create scanner
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("Are you an A, B, C, or D customer? ");
		customer = keyboard.nextLine();
		
		customer = customer.toUpperCase();
				
		switch (customer)
		{
		case "A":
			discount = A;
			System.out.println("You will recieve a 20% discount. ");
		break;
		
		case "B":
			discount = B;
			System.out.println("You will recieve a 10% discount. ");
		break;
			
		case "C":
			discount = C;
			System.out.println("You will recieve a 5% discount. ");
		break;
		
		case "D":
			discount = D;
		break;
		
		default:
			System.out.println("That is incorrect. Please restart the program ");
			break;
			
		}
		
		tax = itemPrice * TAX_RATE;
		subtotal = itemPrice + tax;
		total = subtotal * discount;
		
		System.out.println("The item price is $" + itemPrice);
		System.out.println("Your subtotal is $" + subtotal);
		System.out.println("Your discount is: " + discount + "%");
		System.out.println("Your total with discount is $" + total);
		
		
	}//end of main

}//end of class
