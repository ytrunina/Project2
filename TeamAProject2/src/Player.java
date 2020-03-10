/**
 * The Player class which holds the balance and the game state.
 * 
 * @author Yelena Trunina, Jorrell Smith
 *
 * @version 1.0
 * @since 03/06/2020
 */
 
public class Player {
	private Penny penny;
	private Nickel nickel;
	private Dime dime;
	private Quarter quarter;
	private int balance;
	private boolean gameOver = false;
	private String playerName = "";
	
	/**
	 * Player Constructor
	 * @param m_playerName
	 */
	
	Player(String m_playerName) {
		this.penny = new Penny();
		this.nickel = new Nickel();
		this.dime = new Dime();
		this.quarter = new Quarter();
		this.balance = 0;
		this.playerName = m_playerName;
	}

	/**
	 * Setter method for the Players Name
	 * @param m_playerName
	 */
	
	public void setPlayerName(String m_playerName) {
		this.playerName = m_playerName;
	}
	
	/**
	 * Getter method for the Players Name
	 * @return playerName
	 */
	
	public String getPlayerName() {
		return this.playerName;
	}
	
	/**
	 * Setter method for the Players Balance
	 * @param m_balance
	 */
	
	public void setBalance(int m_balance) {
		this.balance = m_balance;
	}
	
	/**
	 * Getter method for the Players Balance
	 * @return balance
	 */
	
	public int getBalance() {
		return this.balance;
	}
	
	/**
	 * Setter method for the Game Status
	 * @param gameStatus
	 */
	
	public void setGameStatus(boolean gameStatus) {
		this.gameOver = gameStatus;
	}
	
	/**
	 * Getter method for the Game Status
	 * @return gameOver
	 */
	
	public boolean getGameStatus() {
		return this.gameOver;
	}
	
	/**
	 * Method to determine if the Player can flip again
	 * @return true, false
	 */
	
	public boolean flipAgain() {
		if((double)getBalance() / 100 < 1.00)
			return true;
		return false;
	}
	
	/**
	 * Method for Player to start flipping coins
	 */
	
	public void start() {
		
		
		setBalance(getBalance() + penny.coinFlip());
		setBalance(getBalance() + nickel.coinFlip());
		setBalance(getBalance() + dime.coinFlip());
		setBalance(getBalance() + quarter.coinFlip());
						
		if((double)getBalance() / 100 == 1.00) {
			setGameStatus(true);
			System.out.println("You won the game");
		}
		else if((double)getBalance() / 100 > 1.00) {
			setGameStatus(true);
			System.out.println("\n\nSorry, you've lost.");
		}
		
		System.out.printf("The current balance is: %.2f\n", (double)getBalance() / 100);
					
		
	}
}	// End of Player Class
