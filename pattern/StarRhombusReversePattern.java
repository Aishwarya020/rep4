package pattern;

public class StarRhombusReversePattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
int i,j,s;		
		
		for(i=0;i<4;i++) {
					
					for(s=0;s<=i;s++) {
						
						System.out.print(" ");
					}
					
					for(j=3;j>=i;j--) {
					
					System.out.print("*");
					System.out.print(" ");
		            }
					
			System.out.println();
					
				}
		
		
		
		for(i=0;i<4;i++) {
					
					for(s=3;s>=i;s--) {
						
						System.out.print(" ");
					}
					
					for(j=0;j<=i;j++) {
					
					System.out.print("*");
					System.out.print(" ");
		            }
					
			System.out.println();
					
				}

	}

}
