
public class TaskForLoops {

	public static void main(String[] args) {
		// for ever numbers java will keep adding +2 or c+=2;

	///// another way to print even numbers
		int i=1;
		while (i<=20) {
			
			if(i%2==0) {
				System.out.print(i + " ");
			}
		i++;
		}
		
		
		// another way to print even numbers
		
		int c = 2;
		while (c <= 20) {
			System.out.print(c + " ");
			c+=2;

		}
		// pls print all numbers 20-50;
		int b = 50;
		while (b >= 20) {
			System.out.print(b + " ");

			b--;


		}
	}
}