/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		System.out.print("Please input your first number: "); 
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		System.out.println("");
		System.out.print("Please input your second number: ");
		int num2 = sc.nextInt();

		boolean a = num1 == num2;
		if(a == true){
			System.out.println("Your numbers are the same!");
		}
		if(a == false){
			System.out.println("Your numbers are different!");
		}
	}
}
