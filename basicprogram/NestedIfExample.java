package basicprogram;

public class NestedIfExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1=20,num2=10;
		
		if(num1!=num2)
		{
			if(num1>num2)
			{
				System.out.println("Num1 is not equal to num2 and is greater than num2");
			}
			else {
				System.out.println("Num1 is smaller than num2");
		}
		
		}
		else 
			{
				System.out.println("Num1 is equal to num2");
				}
	}

}