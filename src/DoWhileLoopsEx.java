import java.util.Scanner;

public class DoWhileLoopsEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        String answer;

        do {
            System.out.println("Did you get a job?");
            answer = sc.nextLine();

        } while (!answer.equals("yes"));

        System.out.println("Congrats");
        /* similarity do while and while is both loops executed conditions is true
         * while loops check first the conditions and then execution 
         * do while can execute first and then can check the condition.
         */
        
        
	}

}
