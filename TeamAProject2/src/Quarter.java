/**
 * The Quarter class which is responsible for holding the value of the coin and returning it after the coin is fliped.
 * 
 * @author Yelena Trunina, Jorrell Smith
 *
 * @version 1.0
 * @since 03/06/2020
 */
 
public class Quarter {
	private int value;
	private Coin coin;
	
	/**
	 * Quarter Constructor
	 */
	
	Quarter() {
		coin = new Coin();
		this.value = 25;
	}
	
	/**
	 * Getter method for quarter value
	 * @return value
	 */
	
	public int getValue() {
		return this.value;
	}
	
	/**
	 * Setter method for quarter value
	 * @param value
	 */
	
	public void setValue(int value) {
		this.value = value;
	}
	
	/**
	 * Method for flipping the coin and returning the value of the quarter
	 * @return getValue, 0
	 */
	
	public int coinFlip() {
		if(coin.sideOfCoin(coin.flipCoin()) == "Heads")
			return getValue();
		return 0;
	}
}	// End of Quarter
