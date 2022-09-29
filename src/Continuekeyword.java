
public class Continuekeyword {

	public static void main(String[] args) {
		// going back to the loop or beginning

		
		
		for (int i = 1; i < 5; i++) {
			if (i == 3) {
				continue;
			}
			System.out.println("hello");

		
		// print numbers 1-20 except number 6-7-8.

		for (int t = 1; t <= 20; t++) {

			if (t == 3 || t == 7 || t == 11) {

				continue;
			}

			System.out.println(t + " ");

		}
	}
}
}