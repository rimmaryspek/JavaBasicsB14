package HomeWorksIfElse;

import java.util.Scanner;

public class repls {

	public static void main(String[] args) {
		// how work 32

		Scanner scanner = new Scanner(System.in);

		System.out.println("Please enter your gender M or F");

		char gender = scanner.next().charAt(0);

		System.out.println("c");

		System.out.println("Please enter your age");
		int age = scanner.nextInt();
		if (age > 25) {

			if (gender == 'f')
				System.out.println("women");
		} else {
			System.out.println("man");
			{

			}
			if (gender > 'f') {

				System.out.println("Girl");
			} else {

				System.out.println("boy");
			}

			// hw33

			Scanner scanner1 = new Scanner(System.in);
			System.out.println("please neter your number");
			int number = scanner.nextInt();

			if (number % 2 == 0) {
				System.out.println("value is even");
				if (number > 1000) {
					System.out.println("even value is large");
				} else {
					System.out.print("Even value is just rigth");

				}
			}

			else {
				System.out.println("Value is odd");
			}
			if (number < 1000) {
				System.out.println("odd value is large");
			} else {
				System.out.println("odd value is just rihth");
			}

		}

	}

}