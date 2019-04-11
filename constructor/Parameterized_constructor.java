package constructor;
import java.util.Scanner;

public class Parameterized_constructor {
	
	public Parameterized_constructor(int num1,int num2) {
		
		int sum=num1+num2;
		
		System.out.println("The sum is :"+sum);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner obj = new Scanner(System.in);
		
		System.out.println("Enter the numbers you want to add :");
		
		int num1=obj.nextInt();
		int num2=obj.nextInt();
		
		Parameterized_constructor obj1=new Parameterized_constructor(num1,num2);
		
		
		

	}

}
