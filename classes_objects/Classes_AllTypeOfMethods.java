package classes_objects;

import java.util.Scanner;

public class Classes_AllTypeOfMethods {
	
	
	Scanner obj1 = new Scanner(System.in);
	
	public void add() {
		
		int num1,num2,sum;
		
		
		
		System.out.println("Enter the numbers you want to add :");
		
		num1=obj1.nextInt();
		num2=obj1.nextInt();
		
		sum=num1+num2;
		
		System.out.println("The sum is :" +sum);
		
	}
	
	public int subtract() {
		
		int num1,num2,sub;
		
		
        System.out.println("Enter the numbers you want to subtract :");
		
		num1=obj1.nextInt();
		num2=obj1.nextInt();
		
		sub=num2-num1;
		return sub ;
		
	}
	
	public void multiply(int mul1,int mul2) {
		
		int prod=mul1*mul2;
		System.out.println("Product is : " +prod);
		
		
	}
	
	public int divide(int num1 , int num2) {
		
		int div=num2/num1;
		return div ;
		
		
	}
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num1,num2,num3,num4;
		Scanner obj1 = new Scanner(System.in);
		
Classes_AllTypeOfMethods obj2 = new Classes_AllTypeOfMethods();
		
		obj2.add();
		
		System.out.println("The subtraction is :"+obj2.subtract());
		
		System.out.println("Enter the numbers you want to multiply :");
		
		num1=obj1.nextInt();
		num2=obj1.nextInt();
		obj2.multiply(num1,num2);
		
		System.out.println("Enter the numbers you want to divide :");
		num3=obj1.nextInt();
		num4=obj1.nextInt();
		System.out.println("The division gives :"+obj2.divide(num3,num4));

			
		

	}

}
