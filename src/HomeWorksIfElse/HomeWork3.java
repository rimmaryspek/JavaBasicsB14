package HomeWorksIfElse;

import java.util.Scanner;

public class HomeWork3 {

	public static void main(String[] args) {
		// You are DMV representative and you need to ask customer their age. 
		//If they are 18 and older you will issue a driver licence to them, 
		//otherwise you will offer them to get a learners permit.

		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter your first name");
		String name=scanner.nextLine();
		
		System.out.println("print your age");
		int age= scanner.nextInt();
		if (age>18) {
			System.out.println("Congratulations you get a driging lisence");
		} else {
			System.out.println("Congratulations you will get learning permit");
			
		}
				
	}

}
