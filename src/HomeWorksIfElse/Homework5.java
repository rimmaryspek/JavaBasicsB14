package HomeWorksIfElse;

import java.util.Scanner;

public class Homework5 {

	public static void main(String[] args) {
		// Create a Java program that will ask if user has a credit card or not. 
		//If you user does not have a credit card then offer them. 
		//If they do have one ask what is balance on the card? If balance of the card is larger than 1000, 
		//tell them to pay off immediately, 
		//otherwise you can tell them that they can spend more.

		Scanner scanner=new Scanner(System.in);
		System.out.println("Hi do you have a credit card?");
		boolean answer=scanner.nextBoolean();
		
		if (answer=false);{
			System.out.println("would you like one?");
			System.out.println("What is your income?");
			double income=scanner.nextDouble();
			
			if (income>1000) {
				System.out.println("You are almost approve for 2000 credit limit");
			}else {
				System.out.println("may be next time");{
					
				} {
					System.out.println("what balance on your CC");
					
				double balance=scanner.nextDouble();
				if (balance>=1000);
				System.out.println("you should pay rigth away");{
					
				}
				} {
				
				System.out.println("keep going the same");
				}
				
			
				
			}
		}
		
	}

}
