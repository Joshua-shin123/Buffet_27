/*
 *	Author:
 *  Date:
 *	Collaborator(s): 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		System.out.print("Please enter a width: ");
		Scanner sc = new Scanner(System.in);
		int width = sc.nextInt();
		System.out.print("Please enter a height: ");
		int height = sc.nextInt();
		int x = 0;
		int y = 0;

		while(true){
			if(y == height){
				break;
			}
			x = 0;
			while(true){
				if(x == width){
					break;
				}
				System.out.print("*");
				x++;
				}
			System.out.println();
			y++;
		}
		System.out.println("");
		System.out.println("-----------------------------------------------");
		System.out.println("Please enter an integer: ");
		int a = sc.nextInt();

		}
	}
}
