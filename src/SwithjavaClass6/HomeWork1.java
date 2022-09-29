package SwithjavaClass6;

import java.util.Scanner;

public class HomeWork1 {

	private static Scanner in;

	public static void main(String[] args) {
		// Ask user to enter their country and capture it.
		// Once values are captured print which language user speaks.

		Scanner scann = new Scanner(System.in);
		System.out.println("Where are you from?");
		String counrty = scann.nextLine();
		String Language;

		switch (counrty) {

		case "Turkiye":
			Language = "Turkish";
			break;
		case"Uzbekstan":
			Language = "Uzbek";
			break;
		case"USA":
			Language = "american";
			break;
		case "India":
			Language = "Hindi";
			break;
		case "Mexico":
			Language = "mexican";
			break;
		default:
			Language = "unknown";
			break;

		}
		System.out.println( "I am from "  +  counrty   +     "and speak "    +   Language);

	}

}
