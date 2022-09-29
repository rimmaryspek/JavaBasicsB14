package SwithjavaClass6;

import java.util.Scanner;

public class HW2 {

	public static void main(String[] args) {
		Scanner scann = new Scanner(System.in);
		System.out.println("what is the first number?");
		int n1 = scann.nextInt();
		System.out.println("What is the second number?");
		int n2 = scann.nextInt();
		System.out.println("What is the operator");
		char code = scann.next().charAt(0);
		int result = 0;
		if (code == '+') {
			System.out.println("The result is" + (n1 + n2));
		} else if (code == '-') {
			System.out.println("The result is" + (n1 - n2));
		} else if (code == '*') {
			System.out.println("The result is" + (n1 * n2));
		} else if (code == '/') {
			System.out.println("The result is " + (n1 / n2));
		} else {
			System.out.println("Then valid code");
		}
		System.out.println("switch Option");

		switch (code) {
		case '+':
			result = (n1 + n2);
			break;
		case '-':
			result = (n1 - n2);
			break;
		case '*':
			result = (n1 * n2);
			break;
		case '/':
			result = (n1 / n2);
			break;
		default:
		}
		System.out.println("The resut is" + result);

	}

}