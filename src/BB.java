
public class BB extends aa {
BB(){
		
		System.out.println("default");
	}
	BB(int a){
		this();
		System.out.println(a);
	}
	BB(int a,int b){
		this(5);
		System.out.println(a*b);
	}
	
}
class vv extends BB{
	
	vv(){
		//super(2);
		super(20,23);
	}
}
