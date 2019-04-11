package pattern;

public class OneZeroPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i,j;
		
		for(i=1;i<=4;i++) {
			
			for(j=1;j<=4;j++) {
				
			/*	if(i%2==0) {
					System.out.print("0");  
				}
				else {
					
					System.out.print("1");
				}*/
				
				System.out.print(i%2);
		
			}
			System.out.println();

		}
	}
}




