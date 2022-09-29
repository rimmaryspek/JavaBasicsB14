package SwithjavaClass6;

import java.util.Scanner;

public class SwitchDemo3 {

	private static Scanner in;

	public static void main(String[] args) {

		/*
		 * we need to ask the user where he/she is from base on the country we need to
		 * define favorite food
		 * 
		 * 
		 * 
		 */

		Scanner scanner = new Scanner(System.in);
		System.out.println("Where are you from?");
		String country = in.nextLine();
		String favoriteFood = null;
		switch (country) {

		case "usa":
			favoriteFood = "burgers";
			break;
		case "kazakstan":
			break;
		case "Turkey":
			favoriteFood = "adana kebab";
			break;
		case "Ven":
			favoriteFood = "arepas";
			break;
		case "India":
			favoriteFood = "carry";
		case "yemen":
			favoriteFood = "mandi";
			break;
		case "afganistan":
			favoriteFood = "Qaboli palov";
			break;

		default:
			favoriteFood = "Unknown";
			break;
		}

		System.out.println("am from " + country + "and i" +favoriteFood);

	}

}
