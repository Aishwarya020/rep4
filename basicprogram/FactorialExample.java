package basicprogram;
import java.util.*;
public class FactorialExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num;
		
		Scanner obj = new Scanner(System.in);
		System.out.println("Please enter the number :");
		num=obj.nextInt();
		int fact=1;
		
		
		for(int i=num ; i>=1;i--) {
			fact=fact*i;
			
		}
		
		System.out.println("The factorial is :" +fact);
		

	}

}
