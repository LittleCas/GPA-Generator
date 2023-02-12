package classtime;

import java.text.DecimalFormat; //Another way of formatting decimals
import java.util.Scanner;

public class TestLetterGrade {

	public static void main(String[] args) {
		final DecimalFormat df = new DecimalFormat("0.00");
		
		Scanner input = new Scanner(System.in);
		String grade;
		String name;
		
		System.out.println("Enter Student's name");
		name=input.next();	
		
		LetterGrade L  =new LetterGrade(name); //creates a class using the class LetterGrade
		
		System.out.println("Enter your letter grade, enter Q to stop");
	
		grade=input.next(); //accepts grade to enter the loop
		grade=grade.toUpperCase(); // Automatically converts the grade to uppercase
		
		while(!(grade.equalsIgnoreCase("Q"))){ //Accepts grades as long as user doesn't enter Q/q
			L.AddGrade(grade);
			grade=input.next(); 
			grade=grade.toUpperCase();		
		}

		System.out.println("Name: "+ L.getName()); //gets name as it was a private class
		System.out.printf("Total Grade: %1.2f\n", L.getTotalGrade()); //another way of formatting decimals
		System.out.println("Average GPA:  "+ df.format(L.getGPA()));
	}

}
