package Ifelseclass3;

public class Casting {

	public static void main(String[] args) {
		// Type casting => type = date type casting =>converting
		// converting one date type to another
		// why do we use type casting? to use someone's existing code 
		//What is the syntax foe type casting.
		// when we convert something smaller to large we won't get any error
		//If we converting large dt to small dt then
		// we can convert long(DT) to short(DT)
		// Casting or converting is only primitives 
		// 
		int box=123;
		long b1=box; // this is called implicit or widening automatic/ explicit/automating type casting-- when java java converts the dt automatically for us it only happens when we assgn a smaller dt to a larger dt.
		
		/*Explicit/narrowing/manual type casting: 
		 * 
		 */
		long b3=1234566; 
		
		
		
		byte box1=127; // smallest box 8 bits
		short box2=3333; // double size of box1 size in terms of bits 16 bits
		int bo8=353;// large box commonly use and we can not the store decimal number in a box type double 
		int box3=4545454; //commonly use 
        long box4=40404040; // large box 
        float box5=49494949494f; 
        double box6= 48484848; 
        
        int number1=44; // wrong coding 
        int number=(int)15.2; 
        
        byte smollerbox=(byte)box2; 
        
        long box7=box1;// we can do this box7 larger then box1 
        
        float box8=(float)box6; // as box6 is larger it is double we need type casting to assign the value
        
        char a=(char)65;
        System.out.println(a);
        
        int box9=(int)box4;
        System.out.println(box9);
        double val=(int)5000;
        System.out.println(val);
	}

}
