package Ifelseclass3;

public class Castingrecap {
	
	public static void main(String [] agrs ) {
	
	//explicit/narrowing/manual
	short largebox=127;
	byte smallbox=(byte)largebox;
	System.out.print("largerbox");
	
	////explicit/narrowing/manual
	int largebox1=129;
	short smaller2=(short)largebox1;
	System.out.println("smallerbox2");

	short smallerbox3=45;
	long largebox3=smallerbox3;
	System.out.println("largerbox3");
	
	}
}



