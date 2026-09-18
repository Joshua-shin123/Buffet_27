/*
 *	Author:
 *  Date:
 *	Collaborator(s): 
*/
import java.util.Scanner;

class starter {
	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Please enter a number: ");
		int number1 = sc.nextInt();
		
		System.out.println("Here are the next 5 numbers!");
		int one = number1 + 1;
		int two = number1 + 2;
		int three = number1 + 3;
		int four = number1 + 4;
		int five = number1 + 5;
		System.out.println(number1 + ", " + one + ", " + two + ", " + three + ", " + four + ", " + five);
		
		System.out.println("Here are the next 5 multiples of " + number1 + "!" );
		int one1 = number1 * 2;
		int one2 = number1 * 3;
		int one3 = number1 * 4;
		int one4 = number1 * 5;
		int one5 = number1 * 6;
		System.out.println(number1 + ", " + one1 + ", " + one2 + ", " + one3 + ", " + one4 + ", " + one5);
		
		System.out.println("Here is " + number1 + " divided by 100!");
		double cheese = (double)number1 / 100;
		System.out.println(cheese);
		
		System.out.println("Here is " + number1 + " divided by 10!");
		double bread = (double)number1 / 10;
		System.out.println(bread);
		


		




	}
}
