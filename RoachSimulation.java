package cs175;

public class RoachSimulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		RoachPopulation bugs = new RoachPopulation();
		int numRoaches = bugs.getRoaches();

		bugs.startingRocahes(10);

		numRoaches = bugs.getRoaches();
 
		System.out.println("The Roach population is " + numRoaches);

		/// First

		bugs.breed();
		numRoaches = bugs.getRoaches();
		System.out.println("The Roach population after 1st Cycle is " + numRoaches);

		bugs.spray(50);
		numRoaches = bugs.getRoaches();
		System.out.println("The Roach population after 1st Spray is " + numRoaches);

		/// Second

		bugs.breed();
		numRoaches = bugs.getRoaches();
		System.out.println("The Roach population after 2nd Cycle is " + numRoaches);

		bugs.spray(60);
		numRoaches = bugs.getRoaches();
		System.out.println("The Roach population after 2nd Spray is " + numRoaches);

		/// Third

		bugs.breed();
		numRoaches = bugs.getRoaches();
		System.out.println("The Roach population after 3rd Cycle is " + numRoaches);

		bugs.spray(70);
		numRoaches = bugs.getRoaches();
		System.out.println("The Roach population after 3rd Spray is " + numRoaches);

		/// Fourth

		bugs.breed();
		numRoaches = bugs.getRoaches();
		System.out.println("The Roach population after 4th Cycle is " + numRoaches);

		bugs.spray(80);
		numRoaches = bugs.getRoaches();
		System.out.println("The Roach population after 4th Spray is " + numRoaches);

	}

}
