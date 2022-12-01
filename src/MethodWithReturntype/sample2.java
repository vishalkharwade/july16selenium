package MethodWithReturntype;

public class sample2 {
	public static void main(String[] args) {
		
	
	sample2 s2=new sample2();
	int length1 =s2.getlengthofString("vishal");
	System.out.println(length1);
	
	System.out.println("-");
	
	System.out.println(s2.getlengthofString("kharwade patil"));
	}
	
	
	//method with  int return
	public int getlengthofString(String name) {
		
int s1=name.length();
	return s1;
	
	
	}
	

}
