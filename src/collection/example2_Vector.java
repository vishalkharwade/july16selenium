package collection;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class example2_Vector {
	public static void main(String[] args) {
		
		Vector v=new Vector();
		v.add("vishal");
		v.add(122);
		v.add(66.6f);
		v.add("vishal");
		v.add(null);
		v.add(null);
		
		System.out.println(v.capacity());
		System.out.println(v);
		System.out.println(v.size());
		System.out.println(v.contains(122));
		System.out.println(v.get(4));
		//add info 
		System.out.println(v);
		v.add(4, "velocity");
		System.out.println(v);
		//remove info
		v.remove(4);
		System.out.println(v);
		//update info
		v.set(1, "Autuomation");
		System.out.println(v);
		 System.out.println("--print vi info from vector using iterator--");
		
		Iterator itr = v.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
			}
			
			
		System.out.println("---using loops---");
		for(int i=0;i<=v.size()-1;i++) {
			System.out.println(v.get(i));}
		
		System.out.println("***uding for each loop***");
		for(Object s1:v) {
			System.out.println(s1);
		}
		
		System.out.println("print all data using enumeration cursor");
			
		Enumeration enu = v.elements()	;
		while(enu.hasMoreElements()) {
			System.out.println(enu.nextElement());
		}
			
			
			
			
			
			
			
			
			
			
		
		
		
		
	}

}
