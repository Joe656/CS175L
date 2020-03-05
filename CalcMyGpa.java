package housePaintCost;

import java.util.Scanner;

public class CalcMyGpa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		final double a = 4.00;
		final double aMinus = 3.75;
		final double bPlus = 3.33;
		final double b= 3.00;
		final double bMinus= 2.70;
		final double cPlus= 2.30;
		final double c= 2.0;
		final double cMinus= 1.7;
		final double dPlus= 1.30;
		final double d= 1.00;
		final double dMinus= .70; 
		final double f = 0; 
		double gradePoints = 0;
		double totalCreditHours = 0;
		double totalGradePoints= 0;
		System.out.println("Please enter how many classes you are going to enter");
		String classNumberST = scan.nextLine();
		int classNumber = Integer.parseInt(classNumberST);
		for(int i = 1; i<=classNumber; i++ ) {
		System.out.println("Enter your course seperated by commas(title, credit hours, lettergrade) or type Q to quit:");
		String courseStuff = scan.next();
		
		String[] courseInformation = courseStuff.split(","); 
		if (courseInformation[0].equals("Q")) {
			break; 
		}
		else {
			
			String courseTitle= courseInformation[0].trim();
			double creditHours = Double.parseDouble(courseInformation[1].trim());
			String courseGrade = courseInformation[2].trim();
		if 	(courseGrade.equals("A")) {
			gradePoints = a * creditHours;
					
		}
		else if (courseGrade.equals("A-")) {
			gradePoints =  aMinus * creditHours;
		}
		else if (courseGrade.equals("B+")) {
			gradePoints =   bPlus * creditHours;
		}
		else if (courseGrade.equals("B")) {
			gradePoints =  b * creditHours;
		}
		else if (courseGrade.equals("B-")) {
			gradePoints =   bMinus * creditHours;
		}
		else if (courseGrade.equals("C+")) {
			gradePoints =  cPlus * creditHours;
		}
		else if (courseGrade.equals("C")) {
			gradePoints =  c * creditHours;
		}	
		else if (courseGrade.equals("C-")) {
			gradePoints =  cMinus * creditHours;
		}
		else if (courseGrade.equals("D+")) {
			gradePoints =   dPlus * creditHours;
		}
		else if (courseGrade.equals("D")) {
			gradePoints =   d * creditHours;
		}	
		else if (courseGrade.equals("D-")) {
			gradePoints =  dMinus * creditHours;
		}
		else if (courseGrade.equals("F")) {
			gradePoints= f * creditHours; 
		}
			
		System.out.println("Course Title:" +courseTitle+", Credit Hours: "+creditHours+"Grade: "+courseGrade + "Grade Points: "+gradePoints); 	
		totalCreditHours= totalCreditHours+creditHours; 
		totalGradePoints= totalGradePoints+gradePoints; 
		}
		
	}
		System.out.println("Total Number of Hours Attempted:" + totalCreditHours);
		System.out.println("Total Grade Points"+ totalGradePoints);
		System.out.println("Your GPA is: "+totalGradePoints/totalCreditHours);
}
}