/*
 *	Author:  Joshua Shin
 *  Date: 10/12/26
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		// Your code goes below here
		System.out.print("What is your name? ");
		Scanner sc = new Scanner(System.in);
		String name = sc.nextLine();
		System.out.print("How many times should I print out your name? ");
		int x = sc.nextInt();

		int y = 0;
		while(y < x){
			if (y == x){
				break;
			}
			System.out.println(name);
			y = y + 1;
		}



		
	}
}
