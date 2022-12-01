
public class palendrom {
	//Palindrome no-same from both side

	public static void main(String[] args) {
		int r,sum=0,temp;
		int no=454;
		temp=no;
		while(no>0)
		{
			r=no%10;
			sum=(sum*10)+r;
			no=no/10;
		}
		
		if(temp==sum)
		{
			System.out.println("palindrome");
		}
		else
		{
			System.out.println("Not palindrome");
		}
	}
	
}
