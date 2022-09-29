package LogicOperClass5;

import java.util.Scanner;

public class task2hands {

	public static void main(String[] args) {
		//Write a program that will read three inputs of scores (quiz, mid term, and final scores) 
				//and determine the grade based on the following rules: 
				//if the average score >=90 → grade=A
				//if the average score >= 70 and <90 → grade=B
				//if the average score>=50 and <70 → grade=C
				//if the average score<50 → grade=F


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
				
					System.out.println("-------------------");
					
					
				Scanner input = new Scanner(System.in);
		        System.out.println("Please Enter your Quiz Score?");
		        double quiz = input.nextDouble();
		        System.out.println("Please Enter your mid term Score?");
		        double midterm = input.nextDouble();
		        System.out.println("Please Enter your Final Score?");
		        double Final = input.nextDouble();
		        double average;
		        String grade = "null";

		        average = (quiz+midterm+Final)/3;

		        if(average>=90 && average<=100) {
		            grade = "A";
		        }else if(average>=70 && average<90) {
		            grade = "B";
		        }else if(average>=50 && average<70) {
		            grade = "C";
		        }else if(average<50) {
		            grade = "F";
		        }else {
		            System.out.println("Please enter valid score!");
		            grade ="None";
		        }
		        System.out.println("Grade: "+grade);


					
					
					
					
					
					
					
					
					
					

	}

}
}