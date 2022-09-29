
public class WhileLoopTask {

	public static void main(String[] args) {
		// print numbers 100 to1
		// print eve numbers 20-100
		// print 100 only odd numbers

		int i = 100;

		while (i <=1) {
			System.out.print(i + " ");
		}
	i--;

		// task 2
		int e = 20;
		while(e<=100) {
			System.out.print(e + " ");
		}
			e+=2;
			
	// another way
			int e1 =20;
			while (e1<=100) {
				if (e1 %2==00) {
					System.out.print(e1 + " ");
				}
				e1++;
				
			}

	// pls enter odd number
			int o=99;
			while(o>=1) {
				if(o%2==00) {
					System.out.println(o +  " ");
				}
			o--;
			}
			
	}	
}
