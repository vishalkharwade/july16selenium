package Logical_programs;

public class Imp_Armtrong_Number {
	public static void main(String[] args) {
		
	
	int org=153;
	int sum=0;
	
	for(int i=org;i>0;i=i/10) {
		int rem = i % 10;  //1%10 = 1 
		sum = sum + (rem * rem * rem);
		
	}
	if(org==sum) {
		System.out.println("given number " + org+ " is an armstrong number");
	}else {
		System.out.println("given number " + org + " is not an armstrong number");
	}

}
}