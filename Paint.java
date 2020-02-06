
package housePaintCost;

import java.util.Scanner; 
public class Paint{

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in); 

		System.out.print("Enter the Lenght of the house: ");
		int houseLenght = in.nextInt(); 
		System.out.print("Enter the Height of the house: ");
		int houseHeight = in.nextInt(); 
		System.out.print("Enter the Width of the house: ");
		int houseWidth = in.nextInt(); 
		System.out.print("Enter the cost of the painter: ");
		int painterCost = in.nextInt(); 
		System.out.print("Enter # of Windows ");
		int numberWindows = in.nextInt();
		System.out.print("Enter the Lenght of Windows ");
		int lenghtWindows = in.nextInt();
		System.out.print("Enter the Height of Windows: ");
		int heightWindows= in.nextInt();
		System.out.print("Enter the # of Doors ");
		int numberDoors = in.nextInt();
		System.out.print("Enter the lenght of Doors: ");
		int lenghtDoor = in.nextInt();
		System.out.print("Enter the height of the Doors ");
		int heightDoor = in.nextInt();
		int houseSqFt= houseLenght * houseWidth; 
		int doorDimensions = heightDoor * lenghtDoor* numberDoors; 
		int windowDimensions = lenghtWindows * heightWindows * numberWindows; 
		double peakSqft = ((.5*(houseLenght*(houseHeight-houseWidth)))+ houseSqFt)*2;
		double totalsqft = 2*(houseSqFt)+ (peakSqft); 
		double actualSqft = totalsqft - windowDimensions - doorDimensions;
		double total = painterCost * actualSqft; 
		System.out.println("The total cost is: "+ total);

		System.out.println("The total square foot to paint is "+ actualSqft); 
		System.out.println("The square footage is: "+ totalsqft); 


	}

}
