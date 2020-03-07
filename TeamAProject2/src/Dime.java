
public class Dime {
	private int value;
	private Coin coin;
	
	/**
	 * Dime Constructor
	 */
	
	Dime() {
		coin = new Coin();
		this.value = 10;
	}
	
	/**
	 * Getter method for dime value
	 * @return value
	 */
	
	public int getValue() {
		return this.value;
	}
	
	/**
	 * Setter method for dime value
	 * @param value
	 */
	
	public void setValue(int value) {
		this.value = value;
	}
	
	/**
	 * Method for flipping the coin and returning the value of the dime
	 * @return getValue, 0
	 */
	public int coinFlip() {
		if(coin.sideOfCoin(coin.flipCoin()) == "Heads")
			return getValue();
		return 0;
	}
}	// End of Dime
