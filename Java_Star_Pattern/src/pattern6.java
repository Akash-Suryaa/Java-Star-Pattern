
public class pattern6 {

	public static void main(String[] args) {
	
		 //   ****
		//     ***
		//      **
		//       *
		
		//this loop is for rows
				for(int i=1;i<=4;i++) {
					
					//this is for spaces starts from 3
					for(int j=1;j<=i;j++) {
						System.out.print(" ");
						
					}
					
					//this is for columns
					for(int k=4;k>=i;k--) {
						
						System.out.print("*");
					}
					System.out.println();
					
				}
		
		
		
		
		
	}

}
