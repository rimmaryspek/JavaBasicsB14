package SwithjavaClass6;

import java.util.Scanner;

public class Task2switch {

	public static void main(String[] args) {
		// Homework2

		Scanner scanner= new Scanner(System.in);
		System.out.println("what is your grade");
		char grade = scanner.next().charAt(0);
		String degree = null;

		switch (grade) {
		
		case 'A':
			degree = "Exelent";
			break;
		case 'B':
			degree = "Good";
			break;
		case 'C':
			degree = "not Bad";
		case 'D':
			break;
		default:
			degree = "Not eligible";
		}
		
		System.out.println("Your grade is " + degree);

	}

}
