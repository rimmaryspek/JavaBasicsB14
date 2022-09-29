package LogicOperClass5;

import java.util.Scanner;

public class Homework {

	public static void main(String[] args) {
/*1. Write a program that will ask user to input inputs the current time (use 24 hour format).
Based on the given time define:
if hour is between 1-11 --> Morning
if hour between 12-15 --> Afternoon
if hour between 16-20 --> Evening
if hour between 21-24 --> Night
*/
     Scanner scan= new Scanner (System.in);
System.out.println("What is the time now ");
int time=scan.nextInt();
if (time>=1 && time<=11) {
	System.out.println("morning time");
}else if (time>=12 && time<=15) {
	System.out.println("its noon time");
}else if(time>=16 && time<=20) {
	System.out.println("evening time");
}else if (time>=21 && time<=24) {
	System.out.println("nigth time");
}

		
		
		
	}

}
