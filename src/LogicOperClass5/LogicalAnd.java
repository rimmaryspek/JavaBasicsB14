package LogicOperClass5;

public class LogicalAnd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
	boolean understandJava=true;
	boolean enjoyJava=true;
	boolean practice=true;
	
	if(understandJava && enjoyJava && practice) {
		
		System.out.println("this is awesome");
	}
	
	
	System.out.println("another exaple");
	
	int num1=100;
	int num2=200;
	int num3=300;
	
	if(num1>num2 && num1>num3) {
		
		System.out.println(num1 +"is the large");
	} else if (num2>num3 && num2>num2) {
		System.out.println(num2 +"is the larges");
		
	}else if (num3>num1 && num3>num2) {
		System.out.println(num3 +"is the large");
	}
	
	
	
	
	}
	

}
