import java.util.Random;
import java.util.Scanner;

public class Menu {
	private String menuOption;
	private String subMenuOption;
	private static Scanner keyboard;
	private String playerNames[] = {"Mario", "Luigo", "Princess Peach", "Bowser", "Toad", "Yoshi"};		//Player Names Array

	/**
	 * Menu Constructor
	 */
	
	Menu() {
		Menu.keyboard = new Scanner(System.in);
	}
	
	/**
	 * Getter method for Scanner Object
	 * @return Scanner Object
	 */
	public Scanner getScanner() {
		return Menu.keyboard;
	}
	
	/**
	 * Setter method for menuOption
	 * @param m_menuOption
	 */
	
	public void setMenuOption(String m_menuOption) {
		this.menuOption = m_menuOption;
	}

	/**
	 * Getter method for menuOption
	 * @return menuOption
	 */

	public String getMenuOption() {
		return this.menuOption;
	}

	/**
	 * Setter method for subMenuOption
	 * @param m_subMenuOption
	 */
	
	public void setSubMenuOption(String m_subMenuOption) {
		this.subMenuOption = m_subMenuOption;
	}

	/**
	 * Getter method for subMenuOption
	 * @return subMenuOption
	 */
	
	public String getSubMenuOption() {
		return this.subMenuOption;
	}
	
	/**
	 * The thankyou function display a final thank you to the user for using the program
	 */
	
	public static void thankyou() {
		System.out.println();
		System.out.println("***Thank you for using this program! Goodbye.***");
	}
	
	/**
	 * Display method for Menu Option. Control for player and players actions
	 */
	
	public void menuOptions() {
		System.out.println("\n\n");
		System.out.println("******************************");
		System.out.printf("%17s\n", "MENU");
		System.out.println("******************************");
		
		//Menu Options
		System.out.println("P - Play Game");
		System.out.println("Q - Quit Game");
		
		//User Menu Choice
		System.out.print("\nPlease select an option: ");
		String userChoice = keyboard.nextLine();
		setMenuOption(userChoice.toUpperCase());
		
		switch(getMenuOption()) {
		
			case "P":
				do {
					Random random = new Random();
					
					Player player = new Player(playerNames[random.nextInt(6)]);		//Player initialed with a random name
					System.out.println("\n\nWelcome " + player.getPlayerName());
					
					do {
						subMenuOptions();
						
						switch(getSubMenuOption()) {
							case "F":
								player.start();
								if(player.getGameStatus()) {
									do {
										System.out.print("\nWould you like to play Again? Y or N ");
										userChoice = keyboard.nextLine();
										userChoice = userChoice.toUpperCase();
									} while(!userChoice.equals("Y") && !userChoice.equals("N"));
									
									if(userChoice.equals("N")) {
										setSubMenuOption("Q");
									}
								}					
								break;
							case "Q":
								break;
							default:
								break;
						}
					
					} while(!player.getGameStatus() && !getSubMenuOption().equals("Q"));
					
				} while(!getSubMenuOption().equals("Q"));
				
				break;	
			case "Q":
				//Display Thank you to the user
				thankyou();
				System.exit(0);
				break;
			default:
				System.out.println("Error: Please select one of the menu options.");
				break;
		};
		
	}
	
	/**
	 * Display For Sub Menu Options
	 */
	
	public void subMenuOptions() {
		System.out.println("\n");
		System.out.println("******************************");
		System.out.printf("%17s\n", "SUB-MENU");
		System.out.println("******************************");
		
		//Menu Options
		System.out.println("F - Flip 4 coins - 1 penny, 1 nickel, 1 dime, 1 quarter");
		System.out.println("Q - Quit flipping coins");
		
		//User Menu Choice
		System.out.print("\nPlease select an option: ");
		String userChoice = keyboard.nextLine();
		setSubMenuOption(userChoice.toUpperCase());
		System.out.println("\n\n");
		
	}
	
}	// End of Menu
