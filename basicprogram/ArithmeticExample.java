package basicprogram;

public class ArithmeticExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num1=20,num2=10;
		int sum,subtract,multiply,division,modulus;
		
		sum=num1+num2;
		subtract=num1-num2;
		multiply=num1*num2;
		division=num1/num2;
		modulus=num1%num2;
		 String newLine = System.getProperty("line.separator");
		System.out.println("The sum of two numbers is :"+sum);
		System.out.println("The subtraction of two numbers is :"+subtract);
		System.out.println("The product of two numbers is :"+multiply);
		System.out.println("The divion of two numbers is :"+division);
		System.out.println("The remainder of two numbers is :"+modulus);
		
		System.out.println(sum+ newLine +subtract+newLine+multiply);
		
		

	}

}
