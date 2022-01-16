
public class pattern5 {

	public static void main(String[] args) {
		//   *
	   //   **
      //   ***
	 //   ****
		
		
		//this loop is for rows
		for(int i=0;i<=4;i++) {
			
			//this is for spaces starts from 3
			for(int j=3;j>=i;j--) {
				System.out.print(" ");
				
			}
			
			//this is for columns
			for(int k=1;k<=i;k++) {
				
				System.out.print("*");
			}
			System.out.println(" ");
			
		}
		
		
		
		
		
		
	}

}
