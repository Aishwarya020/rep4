package basicprogram;

import java.util.Scanner;

public class CalculatorclassExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num1,num2,choice;
		Scanner obj = new Scanner(System.in);
		
		System.out.println("Enter the first number :");
		num1=obj.nextInt();
		
		System.out.println("Enter the second number :");
		num2=obj.nextInt();
		
		System.out.println("Enter choices 1.Addition,2.Subtraction,3.Multiplication,4.Division :");
		choice=obj.nextInt();
		
switch(choice) {
		
		case 1:
			int sum=num1+num2;
			System.out.println("The sum of the numbers is: " +sum);
			break;
			
		case 2:
			int sub=num1-num2;
			System.out.println("The subrtraction of the numbers give :" +sub);
			break;
			
		case 3:
			int mul=num1*num2 ;
			System.out.println("The product of the numbers is :" +mul);
			break;
			
		case 4:
			int div=num1/num2;
			System.out.println("The quotient of the divion is :" +div);
			break;
			
			
		default :
			
			System.out.println("Choice is not defined");
			break;
			
		}
		

	}

}
