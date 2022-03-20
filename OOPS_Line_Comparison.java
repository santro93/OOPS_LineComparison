package com.bridgelabz.oopslinecomparison;

import java.util.Scanner;

public class OOPS_Line_Comparison {
	//declared global variables
	static Double length1;
    static Double length2;
	
	public static void main(String[] args) {
		System.out.println("Welcome to Line Comparison Problem!");
		
		//method call
		OOPS_Line_Comparison lineComparison = new OOPS_Line_Comparison();
		lineComparison.lengthCalculation();
		lineComparison.lengthComparison();
		lineComparison.compareMethod();
	}
	
	 //method: length calculation	
	 public static void lengthCalculation(){

			double x1,x2,y1,y2;
			double x3,x4,y3,y4;
			Scanner sc = new Scanner(System.in);

			System.out.println("Enter the  Co-ordinates of 1st Line");
			x1 = sc.nextDouble();
			x2 = sc.nextDouble();
			y1 = sc.nextDouble();
			y2 = sc.nextDouble();
				
				
			length1 = Math.sqrt(Math.pow((x2 - x1),2) + Math.pow((y2 -y1),2));
			System.out.println("Length of 1st Line: "+length1);
			
			System.out.println("Enter the  Co-ordinates of 2nd Line");
            x3 = sc.nextDouble();
            x4 = sc.nextDouble();
            y3 = sc.nextDouble();
            y4 = sc.nextDouble();
              sc.close();
              
            length2 = Math.sqrt(Math.pow((x4 - x3),2) + Math.pow((y4 -y3),2));
            System.out.println("Length of 2nd Line: "+length2);	    
         }
	 
	// creating method to check length of lines are equal or not. 
	 public static void lengthComparison(){
         if(length1 == length2){
                 System.out.println("The length of line are equals");
         }
         else{
               System.out.println("The length of line are not equals");
         }
     }
	 
	 // creating method for compare length of lines 
     public static void compareMethod(){
			if (length1 >= length2) {
				System.out.println("Length of Line 1 is Greater than length of line 2");	
				 }
			else if (length1 <= length2) {
				System.out.println("Length of Line 2 is Greater than length of line 1");	
			    }
			else {
				System.out.println("Length of Line 1 is Equal to length of line 2");
			    }
     	}
}