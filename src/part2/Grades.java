package part2;

import java.util.Scanner;

public class Grades {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Write a program that lets the user enter 5 marks and in each case prints out
		 * the letter grade: (F=0-49, D=50-59, C=60-69, B=70-79, A=80-100). Also print
		 * out the average of the 5 marks entered and assign it a letter as well.
		 */

		Scanner scan = new Scanner(System.in); // scanning command

//		System.out.println("Enter your marks one by one");
//
//		System.out.println("Enter your first mark");
//
//		double m1 = scan.nextDouble(); // first mark
//
//		System.out.println("Enter your second mark");
//
//		double m2 = scan.nextDouble(); // second mark
//
//		System.out.println("Enter your third mark");
//
//		double m3 = scan.nextDouble(); // third mark
//
//		System.out.println("Enter your fourth mark");
//
//		double m4 = scan.nextDouble(); // first mark
//
//		System.out.println("Enter your fifth mark");
//
//		double m5 = scan.nextDouble(); // first mark
//
//		double avg = (m1 + m2 + m3 + m4 + m5) / 5;
//		
//		System.out.println(" YOur Average marks are" + avg + " with Grade " + getResult(avg));
		
		System.out.println("Enter the number of marks you are going to enter: ");
		int numOfInputs = scan.nextInt();
		
		double avg = 0;
		for(int i = 1; i <= numOfInputs; i++ ) {
			 
			System.out.println("Enter number " + i +": ");
			double marks = scan.nextDouble();
			
			avg += marks;
			
			System.out.println("The grade for this number is " + getResult(marks));
			
		}
		
		avg = avg / (double) numOfInputs;
		System.out.println("The average was " + avg + " with grade "+getResult(avg));


		

	}

	/**
	 * Gives a grade based on marks such that (F=0-49, D=50-59, C=60-69, B=70-79, A=80-100).
	 * @param marks
	 * @return Grade
	 */
	public static String getResult(double marks) {

		if (marks <= 49)
			return "F";
		else if (marks >= 50 && marks <= 59)
			return "D";
		else if (marks >= 60 && marks <= 69)
			return "C";
		else if (marks >= 70 && marks <= 79)
			return "B";
		else if (marks >= 80 && marks <= 100)
			return "A";

		return "N/A";

	}

}
