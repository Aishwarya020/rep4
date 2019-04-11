package classes_objects;

public class classes_basics {
	
	
	
	public void print() {
		
		System.out.println("Hello");
	}
	
	public void add() {
		
		int a=10,b=20,c;
		
		c=a+b;
		
		System.out.println("The sum is :" +c);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		classes_basics obj = new classes_basics();
		
		obj.print();
		obj.add() ;
		

	}

}
