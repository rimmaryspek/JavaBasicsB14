package HomeWorksIfElse;

import java.util.Scanner;

public class HomeWork6 {

	public static void main(String[] args) 
	{
		// Write a program to ask user to enter numbers of worked years and annual salary. 
		//If user worked for more or equals to 5 years than user is eligible for the bonus, otherwise he is not. 
		//Once user is eligible and salary is larger than 50000 than bonus = 5000, 
		//otherwise bonus=3000.

	Scanner scanner= new Scanner(System.in);	
	
	System.out.println("how many years working?");
	
	double years=scanner.nextDouble();
	if(years>=5) {
	System.out.println("you can get a company Bonus");
	System.out.println("what is you annual salary?");
	Double salary=scanner.nextDouble();
	if(salary>=5000) {
		System.out.println("congrats you get $5000 bonus");
	}else {
		System.out.println("you bonus for this month is $3000");
		
	}
	}else { 
		System.out.println("keep up 10 more days and you get bonus");
	}
	}
		
		
		
		
	}


