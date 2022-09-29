package LogicOperClass5;

import java.awt.Shape;
import java.util.Scanner;

public class logicTask {

	public static void main(String[] args) {
		// 1. Prompt the user to enter person heights in inches.
		// Person should be classified as one of the following:
		// short (under 60 inch)
		// medium(between 60 -72 inch)
		// tall (over 72 inch)

		int shortppl = 60;
		int medium = 72;
		int toll = 72;

		if (shortppl > medium && shortppl > toll) {
			System.out.println("sharp peaple are toll");
		} else if (shortppl > medium && shortppl > shortppl) {
			System.out.println("medium are toll ppl");
		} else if (toll > shortppl && medium > toll) {
			System.out.println("toll ppl are toll");
		}

		System.out.println("peale are toll if the are 72 inches");
		
		
		

        Scanner scann = new Scanner (System.in);
        System.out.println("Please enter your height");
        double height=scann.nextDouble();

        if(height<60)
        {
            System.out.println("Short");
        }
        else if (height>60 && height<72)
        {
            System.out.println("Medium");
        }
        else if (height>72)
        {
            System.out.println("Tall");
        }
		
		
		
		
		
		

	}

}
