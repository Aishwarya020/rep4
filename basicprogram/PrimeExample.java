package basicprogram;

import java.util.Scanner;

public class PrimeExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num ,i;
		Scanner obj = new Scanner(System.in);
		System.out.println("Please enter the number :");
		num=obj.nextInt();
		
		for(i=2;i<num;i++) {		
			
			if(num%i==0)
				break;
			}
			if (i==num){
				System.out.println("The number is  prime");				

			}					
			
			else{
				System.out.println("The number is not prime");
			}
			
		}
			

	}

