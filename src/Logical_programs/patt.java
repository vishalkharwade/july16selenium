package Logical_programs;


public class patt {

	public static void main(String[] args) {

		
		for(int i=0;i<10;i++) {
			for(int j=0;j<10-i;j++) {
				System.out.print(" ");
				}
			for(int k=1;k<=i;k++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		for(int i=10;i>0;i--) {
			for(int j=10-i;j>0;j--) {
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++) {
				System.out.print("* ");
			}
			System.out.println();
			
		}
}
}