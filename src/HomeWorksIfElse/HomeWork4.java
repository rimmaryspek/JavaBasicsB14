package HomeWorksIfElse;

import java.util.Scanner;

public class HomeWork4 {

	public static void main(String[] args) {
		// Create a Java program that will ask user to input city and temperature. 
		//Your program should convert Fahrenheit into celsius and print 
		//“The temperature is the city  is ” 

Scanner Scanner=new Scanner (System.in);
float Fahrenheit, Celsius;

System.out.println("Please enter you city");
String city=Scanner.nextLine();
System.out.println("let me know, what is the wheather in Fahrenheit");
double wheather=Scanner.nextDouble();

System.out.println("let me know how is in Celsius");
wheather =(-32)*5/9;
System.out.println("The tempetarute in" + city + "in celsius is" +wheather);

if(wheather>30) {
	System.out.println("i am not going out");
} else {
	System.out.println("i can go to walk today");
}

	}

}
