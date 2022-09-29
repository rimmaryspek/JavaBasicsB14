
public class NestedLoops {

	public static void main(String[] args) {
		
		// Nested loop is loop inside another loop

				for (int i = 1; i < 3; i++) { // outer loop it controls inner loop
					System.out.println("Hello");

					for (int j = 1; j <= 3; j++) {// nested/inner loop depends on outer loop
						System.out.println("bye");
						
						// the execution is 2 hello and 6bye
					}

				}

		//another example
		System.out.println("-------------");
		for (int i=0;i<=2; i++) {
			
			for (int j=1; j<4; j++) {
				System.out.println(i +" " +j);
			}
			
		}
	}
}