package demo1;
import java.util.Scanner;

public class checkDouble {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the 2 Double Values: ");
		
		
		if(!sc.hasNextDouble()) {
			System.out.println("Error:First Input in Not a Double Value");
			sc.close();
			return;
		}
		double num1=sc.nextDouble();
		
	
			if(!sc.hasNextDouble()) {
			System.out.println("Error:Second input is not a Double Value");
			sc.close();
			return;
		}
		double num2=sc.nextDouble();
		
		
		
		double avg=(num1+num2)/2;
		System.out.println("Average: "+avg);
		sc.close();

	}

}
