package cs175;

public class CounterAssigment {

	public static void main(String[] args) {
		//	public static void main(String[] args) {
		// Creates counter called venue
		Counter venue = new Counter();
		int rValue = venue.getValue();
		// Clicks venue 10 times
		for (int a = 0; a < 10; a++) {
			venue.click();
		}
		// Unclicks venue 5 times
		for (int b = 0; b < 5; b++) {
			venue.unclick();
		}
		// prints expected and actual outcome
		System.out.println("venue expected: 5" );
		rValue = venue.getValue();
		System.out.println("venue actual = " + rValue);
		// Resets venue's count
		venue.reset();
		// Clicks venue 3 times
		for (int c = 0; c < 3; c++) {
			venue.click();
		}
		// Unclicks venue 4 times
		for (int d = 0; d < 4; d++) {
			venue.unclick();
		}
		// Prints expected and actual outcome
		System.out.println("venue expected: -1"  );
		rValue = venue.getValue();
		System.out.println("venue actual = " + rValue);
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

	}


