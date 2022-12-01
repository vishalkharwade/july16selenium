package MethodWithReturntype;



public class example1 {
	
	public static void main(String[] args) {
		
	int num1=addition(10,12);
	System.out.println(num1);
	int num2=addition(13,45);
	System.out.println(num2);
	
	System.out.println("-----");
	System.out.println(addition(12,32));
	System.out.println(addition(30,10));
		
		
		
		}
	
	public static int addition(int a,int b) {
		int sum=a+b;
		return sum;
		
	}
	
}
