
/**
 * This program is a game. The player flips 4 coins consecutively.
 * 1 penny, 1 nickel, 1 dime, and 1 quarter
 * The goal is to score exactly $1.00. 
 * The user must flip until the goal is reached or exceeded which end the game.
 * 
 * @author Yelena Trunina, Jorrell Smith
 *
 * @version 1.0
 * @since 03/06/2020
 */

public class Main {

	/**
	 * The welcome function to displays a welcome message
	 */
	
	public static void welcome() {
		System.out.println("*********************************************************\n" + 
				"           Would like to play a game? \n" + 
				"           \n\nThis program is a game. The player flips 4 coins consecutively.\n1 penny, 1 nickel, 1 dime, and 1 quarter. \n\n" + 
				"The goal is to score exactly $1.00. The user must flip until \nthe goal is reached or exceeded which end the game. \n" + 
				"\nCreated by:\n" +
				"Yelena Trunina\n" +
				"Jorrell Smith \n" + 
				"           \nLast modified 03/06/2020\n\n\n" + 
				"*********************************************************");
	}
	
	/**
	 * The thankyou function display a final thank you to the user for using the program
	 */
	
	public static void thankyou() {
		System.out.println();
		System.out.println("***Thank you for using this program! Goodbye.***");
	}
	
	/**
	 * The main initializer of the program, function main
	 * @param args Command-line arguments
	 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		welcome();
		Menu menu = new Menu();
		do {
			menu.menuOptions();
			
		} while (!menu.getMenuOption().equals("Q"));
		
		
		menu.getScanner().close();
		
		//Display Thank You to the user
		thankyou();
		
		
	}

}	// End of Main
