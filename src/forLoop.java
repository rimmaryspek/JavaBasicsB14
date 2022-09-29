
public class forLoop {

	public static void main(String[] args) {
		// FOR starts
		// (initialization, conditions, increment /decrement)

		for (int i = 1; i <= 5; i++) {

			System.out.print("Hello" + " ");
		}
	
	System.out.println("--------------");
	
	// print numbers 1-20
	
	for(int i=1; i<=20; i++) {
	System.out.print("i");
	
	
	}
	System.out.println("--------");
	// print number 30-10
	
	for (int w=30; w>=10; w--) {
		System.out.print(w + "   ");
		
	}
	//what is the output
	
	// for loops --- we are use when we know in advance the the execute or result 
	// when we know how many times repeat block in advance we will use FOR loop
	// when we don not in advance how many repeat block of code -- use while or do while
	//

	System.out.println("----------");
	
	for (int i=0; i<=10; i+=2) {
		System.out.print(i + " ");
	}
	
	
	
	}	
}