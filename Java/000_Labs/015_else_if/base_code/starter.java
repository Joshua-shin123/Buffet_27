/*
 *	Author:  Joshua Shin
 *  Date: 9/30/26
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		System.out.print("Pick a number between 1 - 1000: ");
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = (int)(Math.random() * 1001);

		if(x > y){
			System.out.println("Your number was larger than the number. The number was " + y + ".");
		}
		else if(x < y){
			System.out.println("Your number was smaller than the number. The number was " + y + ".");
		}
		else if(x == y){
			System.out.println("Your number was equal to the number. The number was " + y + ".");
		}
	}
}
