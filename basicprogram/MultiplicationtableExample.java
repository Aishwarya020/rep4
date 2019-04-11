package basicprogram;

import java.util.Scanner;

public class MultiplicationtableExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num,multiply=1;
		
		Scanner obj = new Scanner(System.in);
		System.out.println("Please enter the number :");
		num=obj.nextInt();
		
		int mul=10 ;
		System.out.println("The table of "+num+ " is :");
		
		for(int i=1;i<=mul;i++) {
			multiply=i*num;
			System.out.println(num+ "*" +i+ "=" +multiply );
		}

	}

}
