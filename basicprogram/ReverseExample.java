package basicprogram;

import java.util.Scanner;

public class ReverseExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
int num,new_num=0,temp;
		
		Scanner obj = new Scanner(System.in);
		System.out.println("Please enter the number :");
		num=obj.nextInt();
		
		while(num!=0) {
			
		temp=num%10;
		new_num=new_num*10+temp;
		num=num/10;		
		
	}
		System.out.println("The reversed number is :" +new_num);

}
}
