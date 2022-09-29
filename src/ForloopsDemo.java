import java.util.Scanner;

public class ForloopsDemo {

	public static void main(String[] args) {
		//please print the number till 10 using scanner  
   
	// all the loops are interchangeable but sometimes using one type of loop
	// can make your cleaner and easier understand your code
		Scanner scann = new Scanner(System.in);
		System.out.println("enter the number");
		int i=scann.nextInt();
		while(i!=10) {
			System.out.println(i);
			i=scann.nextInt();
		}
		
		//another way
		for(int k = 0; k!=10; k++){
			System.out.println(i);
		}
	}

}
