/*
 *	Author:
 *  Date:
 *	Collaborator(s): 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		int r = (int)(Math.random() * 256);
        int g = (int)(Math.random() * 256);
        int b = (int)(Math.random() * 256);
        int r2 = 255 - r;
        int g2 = 255 - g;
        int b2 = 255 - b;
        
        System.out.println("Random color: rgb(" + r + ", " + g + ", " + b + ")");
        System.out.println("Complementary Color: rgb(" + r2 + ", " + g2 + ", " + b2 + ")");
        getColor(r, g, b);
        getColor(r2, g2, b2);

        System.out.println("");
        System.out.println("Triadic Colors");
        getColor(r, g ,b);
        getColor(b, r ,g);
        getColor(g, b, r);

        int R = (int)(Math.random() * 129);
        int G = (int)(Math.random() * 129);
        int B = (int)(Math.random() * 129);
        
        System.out.println("");
        System.out.println("Dark Color");
        getColor(R, G, B);

        int lightR = (int)(Math.random() * 127 + 128 );
        int lightG = (int)(Math.random() * 127 + 128 );
        int lightB = (int)(Math.random() * 127 + 128 );

        System.out.println("");
        System.out.println("Light Color");
        getColor(lightR, lightG, lightB);

        System.out.println("");
        System.out.println("Bluer Color");
        getColor(R, G, lightB);

        int R2 = (int)(Math.random() * 20 + 110);
        int G2 = (int)(Math.random() * 20 + 140);
        int B2 = (int)(Math.random() * 10 + 1);
        System.out.println("");
        System.out.println("My Color: Vomit");
        getColor(R2, G2, B2);
		// Call getColor(#, #, #);
	}

	public static void getColor(int red, int green, int blue){
        String startColor = "\u001B[48;2;" + red + ";" + green + ";" + blue + "m";
        String resetColor = "\u001B[0m";
        String swatch = startColor + "                    " + resetColor;
        

        System.out.println(swatch);
    }
}
