package basicprogram;

import java.util.Scanner;

public class SwitchcaseExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int choice ;
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter choices 1,2,3 :");
		choice=obj.nextInt();
		
		switch(choice) {
		
		case 1:
			System.out.println("Hey");
			break;
			
		case 2:
			System.out.println("Hi");
			break;
			
		case 3:
			System.out.println("Hello");
			break;
			
		default :
			System.out.println("Morgen");
		}
		
		

	}

}
