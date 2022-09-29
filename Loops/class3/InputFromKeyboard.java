package class3;

import java.util.Scanner;

public class InputFromKeyboard {

	public static void main(String[] args) {
		
		// Scanner is the class that helps us take the input from the keyboard it contains many different  smaller modules that can 
		// called methods 
		Scanner input=new Scanner(System.in);
		// a message will be displayed to the user on the console to enter his/her name
		System.out.println("please enter your name ");
		//
		
		String name=input.next();
		System.out.println("hello"  +name+  "dont be cunfused");

	}

}
