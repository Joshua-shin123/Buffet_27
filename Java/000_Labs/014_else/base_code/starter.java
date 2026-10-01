/*
 *	Author:  Joshua Shin
 *  Date: 9/25/26
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		System.out.print("Pick a number between 1 - 1000: "); 
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = (int)(Math.random() * 1000);

		if(num1 == num2){
			System.out.println("Your number was the random number." );
			System.out.println(" The number was " + num2 + ".");
		}
		else{
			System.out.print("Your number was not the random number.");
			System.out.println(" The number was " + num2 + ".");
		}
	}
}
