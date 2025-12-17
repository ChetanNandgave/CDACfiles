package demo1;
import java.util.Scanner;

public class PrintNumbers{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter Number: ");
		int num =sc.nextInt();
		
		System.out.println("Given number: "+num);
		System.out.println("Binary Equivalent: "+Integer.toBinaryString(num));
		System.out.println("Octal Equivalent: "+Integer.toOctalString(num));
		System.out.println("HexaDecimal Equivalent: "+Integer.toHexString(num));
				sc.close();
		
		}
}