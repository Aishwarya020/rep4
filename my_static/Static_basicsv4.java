package my_static;

class Static_basicsv5{
	
	int a;
	static int b;
	
}

public class Static_basicsv4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Static_basicsv5 obj=new Static_basicsv5();
		Static_basicsv5 obj1=new Static_basicsv5();
		Static_basicsv5 obj2=new Static_basicsv5();
		
		obj.a=10;
		obj1.a=20;
		obj2.a=30;
		
		System.out.println(obj.a);
		System.out.println(obj1.a);
        System.out.println(obj2.a);
		
		obj1.b=20;
		obj.b=10;
		obj2.b=30;
		System.out.println();
		System.out.println(obj.b);
		System.out.println(obj1.b);
        System.out.println(obj2.b);
	}

}
