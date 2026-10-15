/*
 *	Author: Joshua Shin
 *  Date: 10/12/26
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		// Your code goes below here
		System.out.print("Pick a number between 1 - 1000: ");
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = ((int)(Math.random() * 1000));

		while((x > y) || (x < y)){
			if(x > y){
				System.out.print("Your number was higher than the randomly generated number. Pick another number between 1 - 1000: ");
				x = sc.nextInt();
			}
			if(x < y){
				System.out.print("Your number was lower than the randomly generated number. Pick another number between 1 - 1000: ");
				x = sc.nextInt();
			}
			if(x == y){
				System.out.print("Congratulations! You correctly guessed the number: " + y + "!");
				break;
			}
		}
		
	}
}
