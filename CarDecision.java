package housePaintCost;

import java.util.Scanner;

public class CarDecision {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the cost of regular car: ");
		double regCar = in.nextDouble();
		System.out.println("Enter Miles per gallon of regular car");
		double mpgReg = in.nextDouble();
		System.out.println("Enter the cost of a hybrid car");
		double hybridCar = in.nextDouble();
		System.out.println("Enter cost of Miles per gallon of Hybridcar ");
		double mpgHybrid = in.nextDouble();
		System.out.println("Enter the cost of gas: ");
		double gasCost = in.nextDouble();
		System.out.println("Enter miles traveled in a year: ");
		double milesTraveled = in.nextDouble();

		double hybridCost = hybridCar + (milesTraveled / mpgHybrid) * (gasCost);
		double carCost = regCar + (milesTraveled / mpgReg) * (gasCost);
		int year = 1;

		for (int x = 0; x < 5; x++) {
			if (hybridCost < carCost) {
				System.out.println("The cost after " + year
						+ (" years is Regular Car: " + carCost + (". Hybrid Car" + hybridCost)));
				System.out.println("The car pays back after " + year + " years");

			} else {
				System.out.println("The cost after " + year
						+ (" years is Regular Car: " + carCost + (". Hybrid Car: " + hybridCost)));
				year++;
				carCost = carCost + (milesTraveled / mpgReg) * (gasCost);
				hybridCost = hybridCost + (milesTraveled / mpgHybrid) * (gasCost);
			}
		}

	}
}