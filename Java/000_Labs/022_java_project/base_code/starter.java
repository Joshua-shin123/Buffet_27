/*
 *	Author: Joshua Shin
 *  Date: 10/15/26
 * 	Collaborator(s): 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		System.out.println("Slot Machine Rules:");
		System.out.println("1. Each player starts with $100.");
		System.out.println("2. Input a wager less than your total amount of money.");
		System.out.println("3. The slot machine will roll 3 numbers from 1 to 10.");
		System.out.println("	a. If two numbers match, you double your money.");
		System.out.println("	b. If three numbers match, you triple your money.");
		System.out.println("	c. If none match, you lose your money.");
		System.out.println("----------------------------------------------------------");
		System.out.println("");
		int points = 100;

		while(true){
			if(points == 0){
				System.out.println("You've run out of money! Thanks for coming! Come back soon!");
				break;
			}
			System.out.print("Would you like to play the slots? (Yes/yes/Y/y) : ") ;
			Scanner sc = new Scanner(System.in);
			String slots = sc.nextLine();
			if(slots.equals("Yes") || slots.equals("yes") || slots.equals("Y") || slots.equals("y")){
				if(x > points){
					System.out.print("You only have $" + points + "! Plese enter a smaller number : ");
				}
				System.out.print("You have $" + points + ". How much would you like to wager? ");
				int x = sc.nextInt();
				int a = (int)(Math.random() * 11);
				int b = (int)(Math.random() * 11);
				int c = (int)(Math.random() * 11);
				System.out.println("");
				System.out.println("Great! Let's play!!!");
				System.out.println("Your rolls are:");
				System.out.println("________________________");
				System.out.println(" | " + a + " | " + b + " | " + c + " | ");
				System.out.println("________________________");

				if((a == b) || (a == c) || (b == a) || (b == c) || (c == a) || (c == b)){
					points = points - x;
					points = points + x * 2;
					System.out.println("You won! Your wager has now been doubled!");
					System.out.println("You now have $" + points + ".");
					System.out.println("------------------------------------------------");
				}
				else if(a == b && b == c){
					points = points - x;
					points = points + x * 3;
					System.out.println("You won! Your wager has now been tripled!");
					System.out.println("You now have $" + points + ".");
					System.out.println("------------------------------------------------");
				}
				else{
					points = points - x;
					System.out.println("Didn't win this time, better luck next time!");
					System.out.println("You now have $" + points + ".");
					System.out.println("------------------------------------------------");
				}
			}
			else if(slots.equals("No") || slots.equals("no") ||slots.equals("N") ||slots.equals("n")){
				System.out.println("Sad to see you go! You still have $" + points + " left. Come again soon! Thanks!");
				break;
			}
			else{
				System.out.print("Wrong answer. ");
			}
		}
	}
}
