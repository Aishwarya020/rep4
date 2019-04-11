package pattern;

public class AStarPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i,j;

		for(i=1;i<9;i++) {
			
			
			for(j=1;j<9;j++) {
				
				if((i==1&&j==4)||(i==2&&(j==3||j==5))||(i==3&&(j==2||j==3||j==4||j==5||j==6))||(i==4&&(j==1||j==7)))
				{
			
			System.out.print("*");
			
		    }
				else {
					
					System.out.print(" ");
				}
				
				
				
			
		}
			
			System.out.println();
		}
		
		
		for (i=1;i<7;i++) {
			
			for(j=1;j<7;j++) {
				
				if(j==3&&(i==1||i==2||i==3||i==4||i==5)) {
					
					System.out.print("*");
					
				}
				
else {
					
					System.out.print(" ");
				}
				
				
			}
			
			System.out.println();
		}


	}

}
