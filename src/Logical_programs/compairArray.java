package Logical_programs;

import java.util.Arrays;

public class compairArray {
	
	public static void main(String[] args) {
		
		int ar1[]= {20,30,40};
		int ar2[]= {20,30,40};
		int ar3[]= {30,30,30};
		
		System.out.println(Arrays.equals(ar1, ar2));
		
		System.out.println(Arrays.equals(ar3, ar2));
		
		System.out.println(Arrays.equals(ar1, ar3));
	}

}
