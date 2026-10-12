/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		System.out.println("What is your name?"); 
		Scanner sc = new Scanner(System.in);
		String name = sc.nextLine();
		System.out.println("What is your title? Ex: Slayer of Dragons");
		String title = sc.nextLine();
		System.out.println("Would you like to be a Wizard, Warrior, or Rogue?");
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


		System.out.println("");
		System.out.println("You have 20 skill points to spend in the following: Strength, Dexterity, Intelligence, and Charisma. Spend them wisely.");
		System.out.println("");
		int points = 20;

		System.out.print("Strength (1-10): ");
		int strength1 = sc.nextInt();
		if(strength1 <= 10){
			points = points - strength1;
			System.out.println("You have " + points + " left to spend.");
		}
		else if(strength1 > 10){
			System.out.print("Please input a smaller value. Strength (1-10): ");
			strength1 = sc.nextInt();
			points = points - strength1;
			System.out.println("You have " + points + " left to spend.");

		}
		System.out.print("Dexterity (1-10): ");
		int dexterity1 = sc.nextInt();
		if((dexterity1 <= 10) && (dexterity1 <= points)){
			points = points - dexterity1;
			System.out.println("You have " + points + " left to spend.");
		}
		else if((dexterity1 > 10) || (dexterity1 > points)){
			System.out.print("Please input a smaller value. Dexterity (1-10): ");
			dexterity1 = sc.nextInt();
			points = points - dexterity1;
			System.out.println("You have " + points + " left to spend.");

		}
		System.out.print("Intelligence (1-10): ");
		int intelligence1 = sc.nextInt();
		if((intelligence1 <= 10) && (intelligence1 <= points)){
			points = points - intelligence1;
			System.out.println("You have " + points + " left to spend.");
		}
		else if((intelligence1 > 10) || (intelligence1 > points)){
			System.out.print("Please input a smaller value. Intelligence (1-10): ");
			intelligence1 = sc.nextInt();
			points = points - intelligence1;
			System.out.println("You have " + points + " left to spend.");

		}
		System.out.print("Charisma (1-10): ");
		int charisma1 = sc.nextInt();
		if((charisma1 <= 10) && (charisma1 <= points)){
			points = points - charisma1;
		}
		else if((charisma1 > 10) || (charisma1 > points)){
			System.out.print("Please input a smaller value. Charisma (1-10): ");
			charisma1 = sc.nextInt();
			points = points - charisma1;

		}
		System.out.println("");
		System.out.println("--------------------------------------------------------");
		System.out.println("Your are " + name + ", the " + title + " of CVHS.");
		System.out.println("You're a " + lol + " with the following stats!");
		System.out.println("Strength - " + strength1);
		System.out.println("Dexterity - " + dexterity1);
		System.out.println("Intelligence - " + intelligence1);
		System.out.println("Charisma - " + charisma1);
		System.out.println("");
		System.out.println("Good luck on your next quest " + name + "!");
	}
}
