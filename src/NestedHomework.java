
public class NestedHomework {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// creating clock home work

		for (int hour1 = 0; hour1 < 3; hour1++) {

			for (int hour2 = 0; hour2 <= 9; hour2++) {

				for (int min1 = 0; min1 <= 5; min1++) {

					for (int min2 = 0; min2 <= 9; min2++) {

						if (hour1 <= 1 || hour2 < 4)

							System.out.println("Time is " + (hour1) + "" + (hour2) + " : " + (min1) + "" + (min2));

					}

				}

			}

		}

	}

}
