package constructor;

public class Chaining {
	
	Chaining(){
		
		
		
		System.out.println("1.Pickachoo");
	}
	
	Chaining(int P1){
		this();
		
		System.out.println("2.Ziggly Puff");
	}
	
	Chaining(int P1,int P2){
		
		this(2);
		
		System.out.println("3.Bulbasaur");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=1,b=2;
		Chaining obj=new Chaining(a,b);

	}

}
