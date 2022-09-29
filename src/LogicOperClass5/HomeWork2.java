package LogicOperClass5;

import java.util.Scanner;

public class HomeWork2 {

	public static void main(String[] args) {
/*HomeWork2
2. Write a program for user to enter his/hers birth month. Based on the month define the season.
Example: if user is born in March, April, May → season =”Spring” 
if user is born in June, July, August → 
season =”Summer”  etc …
 */

	Scanner scan = new Scanner (System.in);
	System.out.println("When is your birthday?");
	String month= scan.nextLine();
	
	if(month.equals("December") || month.equals("January") || month.equals("February")) {
		System.out.println("My birthday is in Winter");
	}else if (month.equals("march")|| month.equals("April") || month.equals("May")) {
		System.out.println("My birthday is in Spring");
	}else if (month.equals("June")|| month.equals("July") || month.equals("August")) {
		System.out.println("My birthday is in Summer");
	}else if (month.equals("September")|| month.equals("October") || month.equals("November")) {
		System.out.println("My birthday is in Auutum");
	}
		
		
		
		
		
		
		
	}

}
