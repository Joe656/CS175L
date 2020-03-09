package housePaintCost;

import java.text.DecimalFormat;
import java.util.Scanner;

public class HeatIndex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#");
		System.out.println("                              NOAA's Nation Weather Service");
		System.out.println("                                     Heat Index");
		System.out.println(" Realtive Humidity(%)(Left Side)                                      Temperature in (F)");

		System.out.printf("        ");
		for (double a = 80; a <= 110; a += 2) {
			System.out.printf("%5.0f", a);
		}

		System.out.println("     ");
		System.out.println(
				"___________________________________________________________________________________________________");

		for (double RH = 40; RH <= 100; RH += 5) {
			System.out.printf("%5.0f | ", RH);
			for (double T = 80; T <= 110; T += 2) {
				double res = (-42.379 + 2.04901523 * T + 10.14333127 * RH - .22475541 * T * RH - .00683783 * T * T
						- .05481717 * RH * RH + .00122874 * T * T * RH + .00085282 * T * RH * RH
						- .00000199 * T * T * RH * RH);
				if (res < 137) {
					System.out.printf("%5.0f", res);
				} else
					System.out.printf(" ");
			}
			System.out.println();
		}
		int temperature = 1;
		while (temperature != 0) {
			System.out.println("Please enter a Temperature or 0 to end");
			temperature = scan.nextInt();
			if (temperature == 0) {
				break;
			} else {
				System.out.println("Please Enter a Humidity");
				int humidity = scan.nextInt();
				double THI = (-42.379 + 2.04901523 * temperature + 10.14333127 * humidity
						- .22475541 * temperature * humidity - .00683783 * temperature * temperature
						- .05481717 * humidity * humidity + .00122874 * temperature * temperature * humidity
						+ .00085282 * temperature * humidity * humidity
						- .00000199 * temperature * temperature * humidity * humidity);

				if (THI <= 90) {
					System.out.println("The THI for Humidity: " + humidity + " and Temperature: " + temperature + " is:"
							+ df.format(THI) + "Advisory: Caution");
				} else if (THI < 105) {
					System.out.println("The THI for Humidity: " + humidity + " and Temperature: " + temperature + " is:"
							+ df.format(THI) + " Advisory:Extreme Caution");
				} else if (THI < 126) {
					System.out.println("The THI for Humidity: " + humidity + " and Temperature: " + temperature + " is:"
							+ df.format(THI) + " Advisory: Danger");
				} else
					System.out.println("The THI for Humidity: " + humidity + " and Temperature: " + temperature + " is:"
							+ df.format(THI) + " Advisory: Extreme Caution");
			}
		}
	}

}
