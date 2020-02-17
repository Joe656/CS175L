package housePaintCost;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Scanner;
public class GroceryDiscount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 boolean start = true; 
 Scanner scan = new Scanner(System.in);
 DecimalFormat df = new DecimalFormat("0.00");
 df.setMaximumFractionDigits(2);
 
while (start = true) {
	System.out.println("Please enter the cost of groceries or '0' to end the program. ");
	 double groceryCost = scan.nextDouble();
if (groceryCost == 0) {
	start = false; 
	return;
}
else if (groceryCost > 210) {
	System.out.println("You won a discount coupon of: "+df.format(groceryCost*.14)+(" 14% of your purchase"));
}
else if (groceryCost > 150 ) {
	System.out.println("You won a discount coupon of: "+df.format(groceryCost*.12)+(" 12% of your purchase"));
}
else if (groceryCost > 60 ) {
	System.out.println("You won a discount coupon of: "+df.format(groceryCost*.10)+(" 10% of your purchase"));
}
else if (groceryCost >= 10) {
	System.out.println("You won a discount coupon of: "+ df.format(groceryCost*.08)+(" 8% of your purchase"));
}
else
	System.out.println("You are not eligible for a dicount code");
}
	}

}
