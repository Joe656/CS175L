package cs175;

public class RoachPopulation {

	
	private int roaches;
	
	public void breed() {
		roaches = roaches*2; 
	}
	
	public int getRoaches() {
		return roaches; 
	}
	
	public void spray(int spray) {
		roaches = roaches-(roaches*spray)/100;
	}

	public void startingRocahes(int cycle) {
		roaches= cycle; 
	}
}