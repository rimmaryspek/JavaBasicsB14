package homelworkoops;

import java.util.Scanner;

public class Loopshw {

	public static void main(String[] args) {
		/*
		 * from the range of 1-50 please find the sum of all even and all odd numbers.
		 * 
		 * 
		 */

		int sumOdd = 0;
        int sumEven = 0;

        for (int i = 1; i <= 50; i++) {
            if (i % 2 == 0) {
                sumEven += i;
            } else {
                sumOdd += i;
            }
        }
        System.out.println("SUM OF ODD NUMBERS = " + sumOdd);
        System.out.println("SUM OF EVEN NUMBERS = " + sumEven);
		
		////////////////////////////////////////////////
		
		
        Scanner input=new Scanner(System.in);
        int secretNumber=8;
        int guessNumber;
        do{
            System.out.println("Please guess the secret number from 1 to 10");
            guessNumber=input.nextInt();
        }while(secretNumber!=guessNumber);
        System.out.println("Congratulations! You won!");
		
		
		
		
	
		
	}

}
