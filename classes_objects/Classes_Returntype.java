package classes_objects;

public class Classes_Returntype {
	
	
	public int add() {
		
		int a=10,b=20,c;
		c=a+b;
		return c;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Classes_Returntype obj=new Classes_Returntype();
		
		/*int sum=obj.add();*/
		
		System.out.println("The sum is :" +obj.add());
		

	}

}
