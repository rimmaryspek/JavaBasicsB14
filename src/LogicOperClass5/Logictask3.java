package LogicOperClass5;

public class Logictask3 {

	public static void main(String[] args) {
		// 3. Ask user to enter a number and then define if number is small, medium or large
		//Small number is value between 1 and 10
		//Medium number is value between 11 and 100
		//Large number is value between 101 and 1000

		int num1=10;
		int num2=100;
		int num3=1000;
		
		if(num1>num2 && num1>num3) {
			
			System.out.println(num1 +"is the large");
		} else if (num2>num3 && num2>num2) {
			System.out.println(num2 +"is the larges");
			
		}else if (num3>num1 && num3>num2) {
			System.out.println(num3 +"is the large");
		}
		
		
	}

}
