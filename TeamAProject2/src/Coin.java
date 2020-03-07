import java.util.Random;

public class Coin {
	private String side1 = "Heads";
	private String side2 = "Tails";
	
	/**
	 * Method to determine Heads or Tails
	 * @param coinFlip
	 * @return side1, side2
	 */
	
	public String sideOfCoin(int coinFlip) {
		if(coinFlip == 0)
			return this.side1;
		else
			return this.side2;
	}
	
	/**
	 * Method to randomly determine the side of the coin
	 * @return 0, 1
	 */
	
	public int flipCoin() {
		Random random = new Random();
		return random.nextInt(2);
	}
}	// End of Coin
