package my_static;

class A {
	
	public void show() {
		
		System.out.println("instance Method");
	}
	
	public static void print() {
		
		System.out.println("static Method");
	}
}



public class StaticMethod_basics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		A obj = new A();
		A.print();
		obj.show();
	}

}
