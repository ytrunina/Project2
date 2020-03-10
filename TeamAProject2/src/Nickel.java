/**
 * The Nickel class which is responsible for holding the value of the coin and returning it after the coin is fliped.
 * 
 * @author Yelena Trunina, Jorrell Smith
 *
 * @version 1.0
 * @since 03/06/2020
 */
 
public class Nickel {
	private int value;
	private Coin coin;
	
	/**
	 * Nickel Constructor
	 */
	
	Nickel() {
		coin = new Coin();
		this.value = 5;
	}
	
	/**
	 * Getter method for nickel value
	 * @return value
	 */
	
	public int getValue() {
		return this.value;
	}
	
	/**
	 * Setter method for nickel value
	 * @param value
	 */
	
	public void setValue(int value) {
		this.value = value;
	}
	
	/**
	 * Method for flipping the coin and returning the value of the nickel 
	 * @return getValue, 0
	 */
	
	public int coinFlip() {
		if(coin.sideOfCoin(coin.flipCoin()) == "Heads")
			return getValue();
		return 0;
	}
}	// End of Nickel
