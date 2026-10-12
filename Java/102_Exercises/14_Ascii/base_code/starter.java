/*
 *	Author: Joshua Shin
 *  Date: 10/2/26
 *	Collaborator(s): 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		System.out.println("Welcome to the Ascii Museum!");
		System.out.println("Please select the exhibit you'd like to view.");
		System.out.println("1. Movies");
		System.out.println("2. Musical Intruments");
		System.out.println("3. Buildings");

		Scanner sc = new Scanner(System.in);
		String exhibit = sc.nextLine();

		if(exhibit.equals("movies") || exhibit.equals("Movies") || exhibit.equals("movie") || exhibit.equals("Movie")){
			System.out.println("Which movie would you like to see?");
			System.out.println("1. Star Wars");
			System.out.println("2, Shrek");
			String movie = sc.nextLine();

			if(movie.equals("Star Wars") || movie.equals("star wars") || movie.equals("Star wars") || movie.equals("star Wars")){
				System.out.println("	    	       .-.");
                System.out.println("      	   	      |_:_|");
                System.out.println("	  	     /(_Y_)\\	");
				System.out.println(".                   ( \\/M\\/ ) ");
				System.out.println(" '.               _.'-/'-'\\-'._ ");
				System.out.println("   ':           _/.--'[[[[]'--.\\_ ");
				System.out.println("     ':        /_'  : |::| :  '.\\ ");
				System.out.println("       ':     //   ./ |oUU|\\.'  :\\ ");
				System.out.println("         ':  _:'..' \\_|___|_/ :   :| ");
				System.out.println("           ':.  .'  |_[___]_|  :.':\\ ");
				System.out.println("            [::\\ |  :  | |  :   ; : \\ ");
				System.out.println("             '-'   \\/'.| |.' \\  .;.' | ");
				System.out.println("             |\\_    \\  '-'   :       | ");
				System.out.println("             |  \\    \\ .:    :   |   | ");
				System.out.println("             |   \\    | '.   :    \\  | ");
 				System.out.println("             /       \\   :. .;       | ");
				System.out.println("            /     |   |  :__/     :  \\ ");
				System.out.println("           |  |   |    \\:   | \\   |   || ");
				System.out.println("          /    \\  : :  |:   /  |__|   /| ");
				System.out.println("          |     : : :_/_|  /'._\\  '--|_\\ ");
				System.out.println("          /___.-/_|-'   \\  \\ ");
				System.out.println("                         '-' ");
				System.out.println("");
				System.out.println("Darth Vader!");

			}
			else if(movie.equals("Shrek") || movie.equals("shrek")){
				System.out.println("###################################################################################### ");
				System.out.println("#                                                                                    # "); 
				System.out.println("#                            ,.--------._                                            # ");
				System.out.println("#                           /            ''.                                         # ");
				System.out.println("#                         ,'                \\     |''\\              /\\          /\\   # ");
				System.out.println("#                /''|     /                   \\    |__''            ( \\        // )  # ");
				System.out.println("#               ''_''|    /           z#####z   \\  //                \\ \\      // /   # ");
				System.out.println("#                 \\  #####        ##------''.  \\//                   \\_\\||||//_/     # ");
				System.out.println("#                  \\/-----\\     /          ''.  \\                     \\/ _  _ \\      # ");
				System.out.println("#                   \\|      \\   |   ,,--..       \\                   \\/|(O)(O)|	     # ");
				System.out.println("#                   || ,.--._ \\  (  || ##   \\)      \\               \\/ |      |      # ");
				System.out.println("#                   ||(  ##  )/   \\ `-....-/       ||-------------_\\/  \\      /      # ");
				System.out.println("#                     '--'.'      \\                \\              /     |____|       # ");
				System.out.println("#                  /'    /         ) --.            \\           ||     /      \\      # ");
				System.out.println("#               ,..|     \\.________/    `-..         \\   \\      \\|     \\ 0  0 /      # ");
				System.out.println("#            _,##/ |   ,/   /   \\           \\         \\   \\      U    / \\_//_/       # ");
				System.out.println("#          :###.-  |  ,/   /     \\        /' ''\\      .\\         (     /             # ");
				System.out.println("#         /####|   |   (.___________,---',/    |       |\\=._____|  |_/               # ");
				System.out.println("#        /#####|   |     \\__|__|__|__|_,/             |####\\    |  ||                # ");
				System.out.println("#       /######\\   \\      \\__________/                /#####|   \\  ||                # ");
				System.out.println("#      /|#######`. `\\                                /#######\\   | ||                # ");
				System.out.println("#     /++\\#########\\  \\                      _,'    _/#########\\ | ||                # ");
				System.out.println("#    /++++|#########|  \\      .---..       ,/      ,'##########.\\|_||                # ");
				System.out.println("#   //++++|#########\\.  \\.              ,-/      ,'########,+++++\\_\\                 # ");
				System.out.println("#  /++++++|##########\\.   '._        _,/       ,'######,''++++++++\\                  # ");
				System.out.println("# |+++++++|###########|       -----.'        _'#######' +++++++++++\\                 # ");
				System.out.println("# |+++++++|############\\.     \\     //      /#######/++++ #### +++\\                  # ");
				System.out.println("#      ________________________\\___//______________________________________          # ");
				System.out.println("#     / ____________________________________________________________________)        # ");
				System.out.println("#    / /              _                                             _                # ");
				System.out.println("#    | |             | |                                           | |               # ");
				System.out.println("#     \\ \\            | | _           ____           ____           | |  _            # ");
				System.out.println("#      \\ \\           | || \\         / ___)         / _  )          | | / )           # ");
				System.out.println("#  _____) )          | | | |        | |           (  __ /          | |< (            # ");
				System.out.println("# (______/           |_| |_|        |_|            \\_____)         |_| \\_)           # ");
				System.out.println("#                                                                                    # ");
				System.out.println("###################################################################################### ");

			}
			else{
				System.out.println("Sorry, we don't have that.");
			}

		}
		else if(exhibit.equals("musical instruments") || exhibit.equals("Musical Instruments") || exhibit.equals("Musical instruments") || exhibit.equals("musical Instruments")){
			System.out.println("Which instrument would you like to see?");
			System.out.println("1. A Guitar");
			System.out.println("2. A Trumpet");
			System.out.println("3. A Violin");
			String music = sc.nextLine();

			if(music.equals("A Guitar") || music.equals("a guitar") || music.equals("Guitar") || music.equals("guitar")){
				System.out.println("           ._.-..-._. ");
        		System.out.println("	 . | Gibson | ");
        		System.out.println("	 0-| o    o |-0 ");
       			System.out.println(" .         |        | ");
        		System.out.println("	 0-| o    o |-0 ");
        		System.out.println("  	   |        | ");
        		System.out.println("	 0-| o    o |-0 ");
        		System.out.println("  	   |        | ");
        		System.out.println("  	   '.      .' ");
        		System.out.println("	 .   '____' ");
        		System.out.println("	     |    | ");
        		System.out.println("	     |    | ");
        		System.out.println("	     |____| ");
        		System.out.println("	     |    | ");
        		System.out.println("	     |    | ");
        		System.out.println(" 	     |____| ");
        		System.out.println("	     |    | ");
        		System.out.println("	     |    | ");
        		System.out.println("	     |____| ");
        		System.out.println("	     |    | ");
        		System.out.println("	     |    | ");
        		System.out.println("	     |----| ");
        		System.out.println("	     |    | ");
        		System.out.println("	     |____| ");
        		System.out.println("	     |    | ");
        		System.out.println("	     |____| ");
        		System.out.println("	     |    | ");
        		System.out.println("	     |____| ");
        		System.out.println("	     |____| ");
        		System.out.println("	     |____| ");
				System.out.println("        _..--|____|       _ ");
				System.out.println("     .'      |____|      ' ' ");
				System.out.println("    .        |____|'.__.'   ' ");
				System.out.println("    :  (o)   ______         ' ");
				System.out.println("    '       |OOOOOO|       ' ");
				System.out.println("     '      |______|      ' ");
				System.out.println("      '                  ' ");
				System.out.println("       '                ' ");
				System.out.println("       :                : ");
				System.out.println("       '                ' ");
				System.out.println("      '                  ' ");
				System.out.println("    .'       ______       '. ");
				System.out.println("   '        |      |        ' ");
				System.out.println("  '         |OOOOOO|         ' ");
				System.out.println(" '          ________          ' ");
				System.out.println(".          (________)          . ");
				System.out.println(":                              : ");
				System.out.println("'           ________       o   ' ");
				System.out.println(" .         0________0   o      . ");
				System.out.println("  .                        o  . ");
				System.out.println("   .                    o    .  ");
				System.out.println("    '.                     .'   ");
				System.out.println("      '.._             _..'   ");
				System.out.println("          ^'--.....--'^  ");
				System.out.println("");
				System.out.println("A Guitar!");


			}
			else if(music.equals("A Trumpet") || music.equals("a trumpet") || music.equals("Trumpet") || music.equals("trumpet")){
				System.out.println("                     /| ");
				System.out.println("       =  =  =      / | ");
				System.out.println("  ____| || || |____/  | -_-_-_-_-_-_ ");
				System.out.println("|)----| || || |____   |        ");
				System.out.println("  ((  | || || |  ))\\  | _-_-_-_-_-_- ");
				System.out.println("    \\_|_||_||_|_//  \\ | ");
				System.out.println("    \\___________/    \\| ");

			}
			else if(music.equals("A Violin") || music.equals("a violin") || music.equals("A violin") || music.equals("a Violin")){
				System.out.println("                           ,-. ");
				System.out.println("                          ((o))");
				System.out.println("                      _  ,-,,-'");
				System.out.println("                     ( `/=//_");
				System.out.println("                    _  /=/='_)");
				System.out.println("                   ( `/=//_");
				System.out.println("                     /=/='_)");
				System.out.println("                    /_/ |");
				System.out.println("                   / /`.'   ===========.");
				System.out.println("                  / //       ##--------^`");
				System.out.println("                 / //");
				System.out.println("                / //");
				System.out.println("               / //");
				System.out.println("              / / |");
				System.out.println("           _ / / -._");
				System.out.println("         .' / /     `.");
				System.out.println("        /  / /       `-.");
				System.out.println("       /  /_/        ' `");
				System.out.println("      '             :  '");
				System.out.println("     '.       ,-  ,-'.:");
				System.out.println("     / /     /.  /  ,-'");
				System.out.println("    /  __   7   / /");
				System.out.println(" .,'  '  ` '   `._");
				System.out.println(" /    |/\\|      ,'.");
				System.out.println("/ _   _        / ,'");
				System.out.println(":' ` | /     ,' /");
				System.out.println("`.   |/ _ , ' ,'");
				System.out.println("   ---''__ ,-'");
				System.out.println("");
				System.out.println("A Violin!");

			}
			else{
				System.out.println("Sorry, we don't have that.");
			}

		}
		else if(exhibit.equals("buildings") || exhibit.equals("Buildings") || exhibit.equals("building") || exhibit.equals("Building")){
			System.out.println("Which building would you like to see?");
			System.out.println("1. Eiffel Tower");
			System.out.println("2. Statue of Liberty");
			System.out.println("3. A Temple");
			String building = sc.nextLine();

			if(building.equals("Eiffel Tower") || building.equals("Eiffel tower") || building.equals("eiffel tower") || building.equals("eiffel Tower")){
				System.out.println("		                                                     1 ");
            	System.out.println("			                                             1 ");
            	System.out.println("			                                             1 ");
            	System.out.println("			                                             M ");
            	System.out.println("			                                             M ");
            	System.out.println("			                                             M ");
            	System.out.println("			                                             M ");
            	System.out.println("			                                            \\M/ ");
            	System.out.println("			                                         . ' M ` . ");
            	System.out.println("			                                       \\##-#####-##/ ");
            	System.out.println("			                                        \\# ##### #/ ");
            	System.out.println("			                                      ############### ");
            	System.out.println("			                                      ############### ");
            	System.out.println("			                                       \\ ! ! ! ! ! / ");
            	System.out.println("			                                        )! ! ! ! !( ");
            	System.out.println("			                                        +---------+ ");
            	System.out.println("			                                        +! ! ! ! !+ ");
            	System.out.println("			                                        +----*----+ ");
            	System.out.println("			                                       +`. .':`. .'+ ");
            	System.out.println("			                                       + .^. : .^. + ");
            	System.out.println("			                                       +:...:*:...:+ ");
            	System.out.println("			                                       +`. .':`. .'+ ");
            	System.out.println("			                                       + .^. : .^. + ");
            	System.out.println("			                                       +:...:*:...:+ ");
            	System.out.println("			                                       +`. .':`. .'+ ");
            	System.out.println("			                                       +. ^. : .^ .+ ");
            	System.out.println("			                                      +:....:*:....:+ ");
            	System.out.println("			                                      +` .  ':`  . '+ ");
            	System.out.println("			                                      +  .^. : .^.  + ");
            	System.out.println("			                                      +:....:*:....:+ ");
            	System.out.println("			                                      +` .. ':` .. '+ ");
            	System.out.println("			                                      +. '` .:. '` .+ ");
            	System.out.println("			                                      +:....:*:....:+ ");
            	System.out.println("			                                      + `. .':`. .' + ");
            	System.out.println("			                                      +   X  :  X   + ");
        		System.out.println("			                                      +.'  `.:.'  `.+ ");
            	System.out.println("			                                     +:......*......:+ ");
            	System.out.println("			                                     +`.   .':`.   .'+ ");
            	System.out.println("			                                     +   X   :   X   + ");
            	System.out.println("			                                     + .' `. : .' `. + ");
            	System.out.println("			                                     +.......*.......+ ");
            	System.out.println("			                                     +` . . ':` . . '+ ");
            	System.out.println("			                                     +   X   :   X   + ");
            	System.out.println("			                                     + '   ` : '   ` + ");
            	System.out.println("			                                     +../########....+ ");
            	System.out.println("			                                     +`/#########\\ .'+ ");
            	System.out.println("			                                    +  ############   + ");
            	System.out.println("			                                    + '############`  + ");
            	System.out.println("			                                    +:.......*.......:+ ");
            	System.out.println("			                                    + ` .  ' : `  . ' + ");
            	System.out.println("			                                    +    X   :   X    + ");
            	System.out.println("			                                    + .'   `.:.'   `. + ");
            	System.out.println("			                                    +:.......*.......:+ ");
            	System.out.println("			                                    +`      ':`      '+ ");
            	System.out.println("			                                   +  `   '  :  `   '  + ");
            	System.out.println("			                                   +    X   : :   X    + ");
            	System.out.println("			                                   +  '   ` : : '   `  + ");
            	System.out.println("			                                   +:.......*.*.......:+ ");
            	System.out.println("			                                   +`      ': :`      '+ ");
            	System.out.println("			                                   + `   '  : :  `   ' + ");
            	System.out.println("			                                   +   X   : X :   X   + ");
            	System.out.println("			                                  +  '   ` :' `: '   `  + ");
            	System.out.println("			                                  +:.......*...*.......:+ ");
            	System.out.println("			                                  +`      ':` ':`      '+ ");
            	System.out.println("			                                  + `   '  : X :  `   ' + ");
            	System.out.println("			                                  +   X   :     :   X   + ");
            	System.out.println("			                                  + '   ` :/   \\: '   ` + ");
            	System.out.println("			                                 +:.......*.....*.......:+ ");
            	System.out.println("			                                 +`      ':`   ':`      '+ ");
            	System.out.println("			                                 + `   '  : `.' :  `   ' + ");
            	System.out.println("			                                +    X   :  ' `  :   X    + ");
            	System.out.println("			                                +  '   ` :'     `: '   `  + ");
            	System.out.println("			                                +:.......*.......*.......:+ ");
            	System.out.println("			                               + `      ':`     ':`      ' + ");
            	System.out.println("			                               +  ` . '  :  `.'  :  ` . '  + ");
				System.out.println("						      +    ' `  :   ' `   :  ' `    + ");
            	System.out.println("			                              +. '    ` : '     ` : '    ` .+ ");
            	System.out.println("			                             +..........*.........*..........+ ");
            	System.out.println("			                             +  ###########################  + ");
            	System.out.println("			                             +  ###########################  + ");
            	System.out.println("			                            +   ###########################   + ");
            	System.out.println("			                         ######################################### ");
            	System.out.println("			                         \\   1   1   1   1   1   1   1   1   1   / ");
            	System.out.println("			                          )  1   1   1   1   1   1   1   1   1  ( ");
            	System.out.println("			                          +-----:-----+-------------+-----:-----+ ");
            	System.out.println("			                          +     :     +             +     :     + ");
            	System.out.println("			                         *------*-----*-------------*-----*------* ");
            	System.out.println("			                         +XXXXXXXXXXX+XXXXXXXXXXXXXXX+XXXXXXXXXXX+ ");
            	System.out.println("			                         *-----*-----*---------------*-----*-----* ");
            	System.out.println("			                        + `.   :  . '+               +` .  :   .' + ");
            	System.out.println("			                        +    . : '   +               +   ` : .    + ");
            	System.out.println("			                       +    . *.    +                 +    .* .    + ");
            	System.out.println("			                       + . '  : `.  +                 +  .' :  ` . + ");
            	System.out.println("			                      *:......*....:*                 *:....*......:* ");
            	System.out.println("			                      + `.   :   . '+                 +` .   :   .' + ");
            	System.out.println("			                     +     `.:. '  +                   +  ` .:.'     + ");
            	System.out.println("			                     +   . '* `.   +                   +   .' *` .   + ");
            	System.out.println("			                    + . '   :    `.+                   +.'    :   ` . + ");
            	System.out.println("			                    + . '   :    `.+                   +.'    :   ` . + ");
            	System.out.println("			                   +  ` .. :  .. ' +                   + ` ..  : .. '  + ");
            	System.out.println("			                   +     . *'     +                     +     `* .     + ");
            	System.out.println("			                  +  .. ' :   ` . +                     + . '   : ` ..  + ");
            	System.out.println("			                  *.:....*.......:*                     *:.......*....:.* ");
            	System.out.println("			                 +   ` ..: . - '  +                     +  ` - . :.. '   + ");
            	System.out.println("			                 +    .. * ..    +                       +    .. * ..    + ");
            	System.out.println("			            ------------------------------------------------------------------- ");
            	System.out.println("			              1 +:       :      +:       :       :       :+      :       :+ 1 ");
            	System.out.println("			              1+ :       :      +:       :       :       :+      :       : +1 ");
            	System.out.println("			            ################################################################### ");
            	System.out.println("			             1   1   1   1   1   1   1   1   1   1   1   1   1   1   1   1   1 ");
            	System.out.println("			             1   1   1   1   1   1   1   1   1   1   1   1   1   1   1   1   1 ");
            	System.out.println("			             +---------------------------------------------------------------+ ");
            	System.out.println("			            +! . ! . ! . ! . !+. ! . ! . ! . ! . ! . ! . ! .+! . ! . ! . ! . !+ ");
            	System.out.println("			           +:!: :!: :!: :!: :!+ :!: :!: :!: :!: :!: :!: :!: +!: :!: :!: :!: :!:+ ");
            	System.out.println("			           +.!.:.!.:.!.:.!.:.!+:.!.:.!.:.!.:.!.:.!.:.!.:.!.:+!.:.!.:.!.:.!.:.!.+ ");
            	System.out.println("			          +XXXXXXXXXXXXXXXXXX+\\     \\  ..-#######-..  /     /+XXXXXXXXXXXXXXXXXX+ ");
            	System.out.println("			         *-------------------* \\    .-' \\  1 1 1  / `-.    / *-------------------* ");
            	System.out.println("			         +  ` .    : ..  '  +   \\.-' \\   .-------.   / `-./   +  `  .. :    . '  + ");
            	System.out.println("			        +.......:.*:........+ .-' \\  .-''         ``-.  / `-. +........:*.:.......+ ");
            	System.out.println("			       +    .  '  : ` .    +\\:  \\  -'                 `-  /  :/+    . ' :  `  .    + ");
            	System.out.println("			       +..:.......:.....:..+/ \\ .-'                     `-. / \\+..:.....:.......:..+ ");
            	System.out.println("			      +    ` .   :    .  ' + \\.'                           `./ + `  .    :   . '    + ");
            	System.out.println("			     +.........:.*..:.....+  /                               \\  +.....:..*.:.........+ ");
            	System.out.println("			    +     .  '  :   ` .   + /                                 \\ +   . '   :  `  .     + ");
            	System.out.println("			    +...:......:........:+ /                                   \\ +:........:..........+ ");
            	System.out.println("			   +    `  .  :  .  '    +/                                     \\+    `  .  :  .  '    + ");
            	System.out.println("			  +...........*.........+                                         +.........*...........+ ");
            	System.out.println("			 +     .  '  :   `  .   +                                         +   .  '   :  `  .     + ");
    			System.out.println("		        +...:.......:.........:+                                           +:.........:.......:...+ ");
    			System.out.println("		       +    `  .    :   .   '  +                                           +  `   .   :    .  '    + ");
    			System.out.println("		      +..........:.*.:........+                                             +........:.*.:..........+ ");
    			System.out.println("		     +     .   '  :   `  .    +                                             +    .  '   :  `   .     + ");
    			System.out.println("		    +...:.........:.........:+                                               +:.........:.........:...+ ");
    			System.out.println("		   +   `   .     :     .   ' +                                               + `   .     :     .   '   + ");
    			System.out.println("		  +...........:.*..:........+                                                 +........:..*.:...........+ ");
    			System.out.println("		 +      .   '  :   `  .     +                                                 +     .  '   :  `   .      + ");
    			System.out.println("		+...:.........:..........:.+                                                   +.:..........:.........:...+ ");
 				System.out.println("	       +     `  .     :      .  ' +                                                     + `  .      :     .  '     + ");
 				System.out.println("	      +            ` *  - '      +                                                       +      ` -  * '            + ");
 				System.out.println("	     ----------------------------------------------------------------------------------------------------------------- ");
				System.out.println("");
				System.out.println("Eiffel Tower!");


			}
			else if(building.equals("Statue of Liberty") || building.equals("statue of liberty") || building.equals("Statue of liberty") || building.equals("statue of Liberty")){
				System.out.println("         ^ ");
				System.out.println("       ,' \\ ");
				System.out.println("       L''/ ");
				System.out.println("       ` | ");
				System.out.println("       J | ");
				System.out.println("       J L ");
				System.out.println("       | | .  , ");
				System.out.println("       | |.`v_L.' ");
				System.out.println("      // ,>-(-\\'_ ");
				System.out.println("      \\`' \\ - /-. ");
				System.out.println("      /   /`''| ");
				System.out.println("       ),'    `- ");
				System.out.println("      (    ,-'  \\ ");
				System.out.println("       ) ,' ,'   h ");
				System.out.println("      / /  /     `)--.. ");
				System.out.println("      \\/  /       \\  <) ");
				System.out.println("       <        ,  L<' ");
				System.out.println("       F/     _/  ,' ");
				System.out.println("       L   ,-'     \\ ");
				System.out.println("       |         ___L ");
				System.out.println("      /         (  F ");
				System.out.println("     J      ___,'  L ");
				System.out.println("     |    ,'       | ");
				System.out.println("     F  ,'         | ");
				System.out.println("    (_,--..__  mt-2|_ ");
				System.out.println("   ,'        `'`--.._\\ ");
				System.out.println(" ,' /                 \\ ");
				System.out.println("/                     (_ ");
				System.out.println("");
				System.out.println("Statue of Liberty!");


			}
			else if(building.equals("A Temple") || building.equals("a temple") || building.equals("a Temple") || building.equals("A Temple") || building.equals("Temple") || building.equals("temple")){
				System.out.println("               )\\         O_._._._A_._._._O         /( ");
				System.out.println("                \\`--.___,'=================`.___,--'/ ");
				System.out.println("	         \\`--._.__                 __._,--'/ ");
				System.out.println("                   \\  ,. l`~~~~~~~~~~~~~~~'l ,.  / ");
				System.out.println("        __           \\||(_)!_!_!_.-._!_!_!(_)||/            __ ");
				System.out.println("        \\`-.__        ||_|____!!_|;|_!!____|_||        __,-'// ");
				System.out.println("         \\    `==---='-----------'='-----------`=---=='    // ");
				System.out.println("         | `--.                                        ,--' | ");
				System.out.println("          \\  ,.`~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~',.  / ");
				System.out.println("           \\||  ____,-------._,-------._,-------.____  ||/ ");
				System.out.println("           ,||\\|___!`======='!`======='!`======='!___|/|| ");
            	System.out.println(".           || |---||--------||-| | |-!!--------||---| || ");
				System.out.println("  __O_____O_ll_lO_____O_____O|| |'|'| ||O_____O_____Ol_ll_O_____O__ ");
				System.out.println("  o H o o H o o H o o H o o |-----------| o o H o o H o o H o o H o ");
				System.out.println(" ___H_____H_____H_____H____O =========== O____H_____H_____H_____H___ ");
				System.out.println("                          /|=============|\\ ");
				System.out.println("()______()______()______() '==== +-+ ====' ()______()______()______() ");
				System.out.println("||{_}{_}||{_}{_}||{_}{_}/| ===== |_| ===== |\\{_}{_}||{_}{_}||{_}{_}|| ");
				System.out.println("||      ||      ||     / |==== s(   )s ====| \\     ||      ||      || ");
				System.out.println("======================()  =================  ()====================== ");
				System.out.println("----------------------/| ------------------- |\\---------------------- ");
				System.out.println("                     / |---------------------| \\ ");
				System.out.println("-'--'--'           ()  '---------------------'  () ");
				System.out.println("                   /| ------------------------- |\\    --'--'--' ");
				System.out.println("       --'--'     / |---------------------------| \\    '--' ");
				System.out.println("                ()  |___________________________|  ()           '--'- ");
				System.out.println("  --'-          /| _______________________________  |\\ ");
				System.out.println(" --'           / |__________________________________| \\ ");


			}
			else{
				System.out.println("Sorry, we don't have that.");
			}

		}
		else{
			System.out.println("Sorry! We don't have that kind of exhibit.");

		}
	}
}
