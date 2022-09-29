package Ifelseclass3;

import java.util.Scanner;

public class Inputkeyboard5 {

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("did you solve Repl assiments");
		boolean solvedanyrepls=scanner.nextBoolean();
	
		int noreplsissolved=0;
		if(solvedanyrepls) {
			System.out.println("how many repl you solved");
			int noreplsissolved1 =scanner.nextInt();
			
			if(noreplsissolved1>=17) {
				System.out.println("YOU ARE DOING GREAT");
			}
		}else if (noreplsissolved<=10) {
			System.out.println("you are solved so mane repls!");
			
		}else {
				System.out.println("you should solve more repls");
		
					 	
			}
		System.out.println("The are very important java please solve them");
	}
	
		
		
		 {

	        String userName="Admin";
	        String password="password";
	        if(password.equals("password123"))
	        {
	            System.out.println("Welcome "+userName);
	        }
	        else
	        {
	            System.out.println("Wrong password "+userName);
	            
	           
	        }

	    }
		
		
		
		
		
		
		
		

	}


