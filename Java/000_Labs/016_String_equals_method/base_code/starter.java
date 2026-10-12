/*
 *	Author:  Joshua Shin
 *  Date: 10/6/26
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		System.out.println("Would you like to be a Wizard, Warrior, or Rogue?"); 
		Scanner sc = new Scanner(System.in);
		String lol = sc.nextLine();

		if(lol.equals("Wizard") || lol.equals("wizard")){
			System.out.println("You've chosen the Wizard! Excelsior!");
		}
		else if(lol.equals("Warrior") || lol.equals("warrior")){
			System.out.println("You've chosen the Warrior! For Honor!");
		}
		else if(lol.equals("Rogue") || lol.equals("rogue")){
			System.out.println("You've chosen the Rogue! How cunning!");
		}
		else{
			System.out.println("You've decided not to choose a role. Rerun program.");
		}

	}
}
