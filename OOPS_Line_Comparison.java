package com.bridgelabz.oopslinecomparison;

import java.util.Scanner;

public class OOPS_Line_Comparison {

	public static void main(String[] args) {
		System.out.println("Welcome to Line Comparison Problem!");
		
		//method call
		OOPS_Line_Comparison lineComparison = new OOPS_Line_Comparison();
		lineComparison.lengthCalculation();
		
	}
	
	 //method: length calculation	
	 public static void lengthCalculation(){

			double x1,x2,y1,y2;
			Scanner sc = new Scanner(System.in);

			System.out.println("Enter the  Co-ordinates of 1st Line");
			x1 = sc.nextDouble();
			x2 = sc.nextDouble();
			y1 = sc.nextDouble();
			y2 = sc.nextDouble();
				sc.close();
				
			double length = Math.sqrt(Math.pow((x2 - x1),2) + Math.pow((y2 -y1),2));
			System.out.println("Length of Line = "+length);
		}
}
