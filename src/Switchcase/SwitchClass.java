package Switchcase;

public class SwitchClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int number=19;

        if(number!=18 ) {
            System.out.println(" this number is not 18");
        }

 int day=4;
 
 if(day==1) {
     System.out.println("Monday");
 }else if (day==2) {
     System.out.println("Tuesday");
 }else if (day==3) {
     System.out.println("Wednesday");
 }else if (day==4) {
     System.out.println("Thursday");
}else if (day==5) {
    System.out.println("Friday");
}else if (day==6) {
    System.out.println("Saturday"); 
}else if (day==7) {
    System.out.println("sunday");
} else {
    System.out.println("Please enter a valid day number(1-7");
}
		String name;
		
		
		switch(day) {
		case 1: 
		 name="Monday";
		 break;// get out from the bracket
		case 2:
			name="Tuesday";
			break;
		case 3:
			name="Wednesday";
			break;
		case 4:
			name="Thursday";
			break;
		case 5:
			name ="friday";
			break;
		case 6:
			name="Saturday";
			break;
		case 7:
			name ="Sunday";
			break;
			default:
				name="Invalid";
				break;
							
		}
			System.out.println("name");
	}

}
