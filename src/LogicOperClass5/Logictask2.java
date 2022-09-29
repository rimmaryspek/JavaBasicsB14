package LogicOperClass5;

import java.util.Scanner;

public class Logictask2 {

	public static void main(String[] args) {
		// 2. Write a program that will print whether it is a weekend or weekday.
		// If any day from 1-5 → output “It is a weekday”,any day from 6-7 → output
		// “It is a weekend”, any other day → output “Invalid day”

		int day = 0;

		if (day >= 1 && day <= 5) {
			System.out.println("its a weekday");
		} else if (day >= 6 && day <= 7) {
			System.out.println("its weekend");
		} else {
			System.out.println("it a valid day");
		}

		System.out.println("--------------------");
		
		Scanner input = new Scanner(System.in);
		System.out.println("please enter numbers between 1-7");
		 
		int d=input.nextInt();

		if(day>=1&&day<=5)
		{
			System.out.println("It is weekday");
		}else if(day==6||day==7)
		{
			System.out.println("it is weekend");
		}else {
			System.out.println("Invalid day");
		
		}
		
		
	}	
}













