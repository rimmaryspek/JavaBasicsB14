package HomeWorksIfElse;

import java.util.Scanner;

public class Homework2 {

	public static void main(String[] args) {
		//Create a Java program and store values of mortgage rate and mortgage price. 
		//First, program should check if rate is higher than 4.5 user will not buy a house, 
		//otherwise user will consider buying. Once user decides to buy a house, 
		//if price of the house is larger than 200000 than user will take a loan, 
		//otherwise user will pay cash.

	Scanner scanner=new Scanner(System.in);
	
	System.out.println("What is the amount loan needed");
	 int loan= scanner.nextInt ();
	 
	 if(loan <=200000) {
		 System.out.println("you are eligable grt a loan");
			 
		 } else {
			 System.out.println("unfortunatally we can not allow you");
	 }
		 
		
		
	}

}
