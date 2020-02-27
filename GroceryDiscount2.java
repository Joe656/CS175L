package housePaintCost;

import java.text.DecimalFormat;
import java.util.Scanner;

public class GroceryDiscount2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean start = true;
		Scanner scan = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("0.00");
		df.setMaximumFractionDigits(2);
		double groceryCost;
		System.out.println("Please enter the cost of your groceries or enter 0 to exit");
	
			while (scan.hasNextDouble()) {

				groceryCost = scan.nextDouble();
				if (groceryCost == 0) {
					start = false;
					return;
				} else if (groceryCost < 10 || groceryCost > 1000) {
					System.out.println("This is not in the correct range");
					return;
				}

				else if (groceryCost > 210) {
					System.out.println("You won a discount coupon of: " + df.format(groceryCost * .14)
							+ (" 14% of your purchase"));
				} else if (groceryCost > 150) {
					System.out.println("You won a discount coupon of: " + df.format(groceryCost * .12)
							+ (" 12% of your purchase"));
				} else if (groceryCost > 60) {
					System.out.println("You won a discount coupon of: " + df.format(groceryCost * .10)
							+ (" 10% of your purchase"));
				} else if (groceryCost >= 10) {
					System.out.println(
							"You won a discount coupon of: " + df.format(groceryCost * .08) + (" 8% of your purchase"));
				} else
					System.out.println("You are not eligible for a dicount code");

				System.out.println("Please enter the cost of your groceries or enter 0 to exit");
			}

		}
	}


