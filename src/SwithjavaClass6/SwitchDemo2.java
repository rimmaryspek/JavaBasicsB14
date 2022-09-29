package SwithjavaClass6;

public class SwitchDemo2 {

	public static void main(String[] args) {
		// matching cases and matching Dt as a variable 
		// Switch case is value base
		// no duplicate case in switch
		// switch can check only equality not conditions 
		
		char choise='N';
		String answer;
		
		switch (choise) {
		
		case 'Y':
			answer ="Yes";
			break;
		case 'N':
			answer ="No";
			break;
		case 'M':
			answer="maybe";
			break;
			default:
				answer="unknown";
				break;
			
		
		}
System.out.println(answer);
	}
// Limitations of Switch Case 
// we can not use logical operator
// switch case can not use relational operators	
//SWITCH CASE can not work with boolean
	
//	boolean boo=true; Double & Float(no decimal) and long.
//switch (boo)
	
	
	
	
	
	
	
	
	
	
	
}
