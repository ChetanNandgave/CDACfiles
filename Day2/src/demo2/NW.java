package demo2;
import java.util.Scanner;


public class NW {
	int num1,num4;
	double num2,num3;
	char ch;
	int chINT;
	double chDou;
	byte chBy;

	public void accept(Scanner sc) {
		System.out.print("Enter Number for Widening: ");
		this.num1=sc.nextInt();
		this.num2=num1;
		
		System.out.print("Enter Number for Narrowing: ");
		this.num3=sc.nextDouble();
		this.num4=(int)this.num3;
		
		this.ch=sc.next().charAt(ch);
		this.chINT=(int)this.ch;
		this.chDou=(double)this.ch;
		this.chBy=(byte)this.ch;
	}
	 public void display() {
	        System.out.println("The value after Widening: " + this.num2);
	        System.out.println("The value after Narrowing: " + this.num4);
	        System.out.println("int: "+chINT);
	        System.out.println("double: "+chDou);
	        System.out.println("Byte"+chBy);
	        char ch2=(char)chINT;
	        System.out.println("Character: "+ch2);
	    }
	
}
