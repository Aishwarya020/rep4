package classes_objects;

public class Classes_methodwithparameter {
	
	
	public void add(int num1,int num2) {
		
		int c=num1+num2;
		System.out.println("Sum is : " +c);
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Classes_methodwithparameter obj = new Classes_methodwithparameter();
		obj.add(10,20);

	}

}
