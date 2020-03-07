
public class Penny {
	private int value;
	private Coin coin;
	
	/**
	 * Penny Constructo
	 */
	
	Penny() {
		this.coin = new Coin();
		this.value = 1;
	}
	
	/**
	 * Getter method for penny value
	 * @return value
	 */
	
	public int getValue() {
		return this.value;
	}
	
	/**
	 * Setter method for penny value
	 * @param value
	 */
	
	public void setValue(int value) {
		this.value = value;
	}
	
	/**
	 * Method for fliping the coin and returning the value of the penny
	 * @return getValue, 0
	 */
	public int coinFlip() {
		if(coin.sideOfCoin(coin.flipCoin()) == "Heads")
			return getValue();
		return 0;
	}
}	// End of Penny
