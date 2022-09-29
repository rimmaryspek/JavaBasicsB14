
public class ForloopExamsDemo {

	public static void main(String[] args) {
		
		// please print numbers 1 3 7 9 except 5
		for (int i=1; i<=9; i+=2) {
			if(i==5) // or if(i!=5) 
				{
				continue;
			}
			System.out.println(i);
		}
		System.out.println("*************************");
		
		// pls print 9 5 1
		for(int i=9; i>=1; i-=4) {
			System.out.println(i);
		}
		
		System.out.println("*************************");
		// in want to print pattern 10 8 6 4 2 
		for (int i=10; i>=0; i-=2) {
			System.out.println(i);
		}
		
		
		//// /////////////////////////
		// with 
		for (int i=-0; i!=3; i++) {
			System.out.println(i);
		}
		
		/////////////////////////////////
		
		for(double i=0; i!=3; i++ ) {
			System.out.println(i);
		}
				
		
	}

}
