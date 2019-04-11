package basicprogram;

import java.util.Scanner;

public class Swaping {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner obj = new Scanner(System.in);
		int num1,num2,temp;
		System.out.println("Enter the first number :");
		num1=obj.nextInt();
		System.out.println("Enter the second number :");
		num2=obj.nextInt();
		
		/*temp=num1;
		  num1=num2;
		  num2=temp;
		 */
		
		num1+=num2; 
		num2=num1-num2; 
		num1-=num2;
		
		System.out.println("The numbers after swaping are : " + "\n num1 : " +num1+ "\n num2 : " +num2 );

	
		
	

	}

}
