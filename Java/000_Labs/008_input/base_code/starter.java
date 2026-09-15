/*
 *	Author:  Joshua
 *  Date: 9/10/26
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		System.out.println("Welcome to In N Out!");
		System.out.println("Here's our menu:");
		double item1Price = 5.99;
		System.out.println("1. Cheeseburger - $" + "item1Price");
		double item2Price = 2.99;
		System.out.println("2. Animal Fries - $" + "item2Price");
		double item3Price = 0.99;
		System.out.println("3. Coca Cola - $" + "item3Price");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Who is purchasing?");
		String name = sc.nextLine();
		System.out.println("How many cheeseburgers would you like?");
		int item1Amount = sc.nextInt();
		System.out.println("How many Animal Fries would you like?");
		int item2Amount = sc.nextInt();
		System.out.println("How many Coca Colas would you like?");
		int item3Amount = sc.nextInt();

		double item1Total = item1Price * item1Amount;
		double item2Total = item2Price * item2Amount;
		double item3Total = item3Price * item3Amount;
		System.out.println("Total is" + item1Total + item2Total = item3Total;)

	}
}
