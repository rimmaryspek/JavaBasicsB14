import java.util.Scanner;

public class ForLooptask {

	public static void main(String[] args) {
		// TASK "FOR" LOOP
		
		// HomeWork #5 Prompt the user the name 3 times and print "Good morning".
		
		Scanner scann = new Scanner(System.in);
		for(int i=1; i<=3; i++) {
			System.out.println( "what is your name?");
			String name=scann.nextLine();
		System.out.println("good morning " + name);
		
		}
		
		System.out.println("-------------");
		
		
		
	
		
	}

}
