package full_Practice;

public class Pyaramid {

	public static void main(String[] args) {
		
		
		for(int i=0;i<10;i++) {
			
			for(int j=0;j<10-i;j++) {
				System.out.print(" ");
			}
			for(int k=1;k<=i-1;k++) {
				System.out.print(" *");
			}
			System.out.println();
		}
		
		
		
	}
}
