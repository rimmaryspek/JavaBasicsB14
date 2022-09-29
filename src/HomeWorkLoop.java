import java.util.Scanner;

public class HomeWorkLoop {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		double price = 5.99;
		double user;

		do {

			Scanner in = new Scanner(System.in);
			System.out.println("Please pay for the coffee");
			user = in.nextDouble();
			if (user > price) {
				System.out.println("Please give less than price");
		
			} else if (user < price) {
				System.out.println("Please give more than price");
			
			}
		} while (user != price);

		System.out.println("Please enjoy your coffee");

		
		
		
		System.out.println("------------");

		// print all numbers from 50 to 20

		// print all even numbers from 1 to 20

		int c = 2;

		while (c <= 20) {
			System.out.print(c + " "); // 2
			c += 2; // c=c+2=4
		}
		System.out.println("Anot her way");

		System.out.println("----------");

		int d = 2;

		while (d <= 20) {

			if (d % 2 == 0) {
				System.out.print(d + " ");
			}

			d++;

			System.out.println("");

			int c1 = 20;

			while (c <= 50) {
				System.out.print(c + " "); // 2
				c += 2; // c=c+2=4
			}
		}

		
	}
	
}






