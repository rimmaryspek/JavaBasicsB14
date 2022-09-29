package LogicOperClass5;

import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner (System.in);
		System.out.println("i was born in winter?");
		String month= scan.nextLine();
		
		String monthoftheyear;
		
		if(month.equals("December") || month.equals("January") || month.equals("February")) {
			monthoftheyear="Winter";
		}else if (month.equals("march")|| month.equals("April") || month.equals("May")) {
			monthoftheyear="Spring";
		}else if (month.equals("June")|| month.equals("July") || month.equals("August")) {
			monthoftheyear="Summer";
		}else if (month.equals("September")|| month.equals("October") || month.equals("November")) {
			monthoftheyear="Auttum";
			
		}else {
			monthoftheyear="Invalid month";
			System.out.println("monthoftheyear");
		}
	
	
	}

}
