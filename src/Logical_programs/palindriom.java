package Logical_programs;

public class palindriom {
public static void main(String[] args) {
	
	String org="madam";
	String rev="";
	
	for(int i=org.length()-1;i>=0;i--) {
		rev=rev+org.charAt(i);
		
	}
	if(org.equals(rev)) {
		System.out.println("is palendrom");
	}else {
		System.out.println("not palemdrom");
	}
}

}
