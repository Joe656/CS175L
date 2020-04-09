package cs175;

public class Counter2 {

	public static void main(String[] args) {
		
		// Creates counter called venue
		Counter anotherVenue = new Counter();
		int rValue = anotherVenue.getValue();
		// Clicks venue 10 times
		anotherVenue.clickMany(10);

		// Unclicks venue 5 times
			anotherVenue.unclickMany(5);
		
		// prints expected and actual outcome
		System.out.println("anotherVenue expected: 5" );
		rValue = anotherVenue.getValue();
		System.out.println("anotherVenue actual = " + rValue);
		
		// Resets venue's count
		anotherVenue.reset();
		
		// Clicks venue 3 times
			anotherVenue.clickMany(3);
		
		// Unclicks venue 4 times
			anotherVenue.unclickMany(4);
		
		// Prints expected and actual outcome
		System.out.println("anotherVenue expected: -1"  );
		rValue = anotherVenue.getValue();
		System.out.println("anotherVenue actual = " + rValue);
	}

	// Counter code given to us
	private int value;

	/**
	 * Gets the current value of this counter.
	 * 
	 * @return the current value
	 */
	
	public int getValue() {
		return value;
	}

	/**
	 * Advances the value of this counter by 1.
	 */
	public void click() {
		value = value + 1;
	}

	/**
	 * Decreases the value of this counter by 1.
	 */

	public void unclick() {
		value = value - 1;
	}

	/**
	 * Resets the value of this counter to 0.
	 */
	public void reset() {
		value = 0;
	}
	public void clickMany(int n) {
		value = value +n;
		
	}
	public void unclickMany(int j) {
		value = value -j;
	}
}
