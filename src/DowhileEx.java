import java.util.Scanner;

public class DowhileEx {

	public static void main(String[] args) {
		// If you get job guys?
		//

		Scanner scann = new Scanner(System.in);
		String answer;
		do {
			System.out.println("did you get a job?");
			answer = scann.nextLine();
		} while (!answer.equals("yes"));

		// will ask the question before java gets correct answer.
		// console
		// id you get a job?
		// no
		// did you get a job?
		// not yet
		// did you get a job?
		// may be
		// did you get a job?
		// yes

	}

}
