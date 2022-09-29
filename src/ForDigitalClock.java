
public class ForDigitalClock {

	public static void main(String[] args) {
		// Digital clock
		for(int i=0; i<60; i++) {
			if(i<10) {
				System.out.println("00:00:"+"0"+i);
			}
		}

	}

}
