package classes_objects;

public class Classes_withReturnType_withParameter {
	
	
public int add(int num1,int num2) {
		
		int sum=num1+num2;
		return sum;
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Classes_withReturnType_withParameter obj=new Classes_withReturnType_withParameter();
		
		System.out.println("The sum is :" +obj.add(10,20));

		
		
		
		

	}

}
