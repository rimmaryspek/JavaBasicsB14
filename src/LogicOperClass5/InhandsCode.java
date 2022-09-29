package LogicOperClass5;

import java.util.Scanner;

public class InhandsCode { 
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan= new Scanner (System.in);
		System.out.println("What is the time now ");
		int time=scan.nextInt();
		
		String timeOfTheDay;
		
		if (time>=1 && time<=11) {
			System.out.println("morning time");
		}else if (time>=12 && time<=15) {
			System.out.println("its noon time");
		}else if(time>=16 && time<=20) {
			System.out.println("evening time");
		}else if (time>=21 && time<=24) {
			System.out.println("nigth time");
		}
		
		if (time>=1 && time<=11) {
			timeOfTheDay="Morning";
		}else if (time>=12 && time<=15) {
			timeOfTheDay="afternoon";
		}else if(time>=16 && time<=20) {
			timeOfTheDay="evening";
		}else if (time>=21 && time<=24) {
			timeOfTheDay="nigth";
			
			System.out.println("Wrong number");
			System.out.println("timaOfTheDay");// needs to be 
   timeOfTheDay= "Invalid";
		}
	
	
	}
}

	
