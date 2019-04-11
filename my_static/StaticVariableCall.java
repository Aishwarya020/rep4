package my_static;


class B {
	
	int num1=10;
	static int num2=20;
	
	public void show()
	{
		
		
		System.out.println("1st method" +num1);
		
		System.out.println("Next of 1st method" +num2);
	}
	
	
	public static void show_next() {
		B obj = new B();
		
	//	System.out.println(num1); --> gives error for non-static instance variable
		
		System.out.println(obj.num1);
		
		System.out.println("2nd method " +num2);
	}
}


public class StaticVariableCall {
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		B obj=new B();
		B.show_next();
		obj.show();
	}

}
