package Ifelseclass3;

import java.util.Scanner;

public class Inputkeyboard44 {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner (System.in);
		System.out.println("Please enter your name");
		// take a String type input from the keyboard and store it in the variable
		String name=scan.nextLine();
		System.out.println("please enter your age");
		// take an integer from the keyboard and it in age variable
		int age=scan.nextInt();
		
		System.out.println("Hi"+ "name" + "you are" + "age" + "years old");
		
		
		

	}

}
