package pattern;

public class StarRectangleOutline {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i,j;

		for(i=1;i<6;i++) {
			
			
			for(j=1;j<6;j++) {
				
				if((i==1&&(j==1||j==2||j==3||j==4||j==5))||(j==1&&(i==1||j==5))||(i==3&&(j==1||j==2||j==3||j==4||j==5)))
				{
			
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
