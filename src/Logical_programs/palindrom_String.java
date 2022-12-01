package Logical_programs;

import java.util.Scanner;

public class palindrom_String {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any String Text");
		String orgtext = sc.nextLine();
		
		//reversing the String text
		char[] cha = orgtext.toCharArray();
		
		int size = cha.length;		
		String revtext = "";
		for(int i=cha.length-1;i>=0;i--) {
			revtext=revtext+cha[i];
		
		}
		//check given String is palendrom or not
		if(orgtext.equals(revtext)) {
		System.out.println("given Stirng is palendriom");}
		else {
			System.out.println("given Stirng is not palendriom");
		}
	}

}
