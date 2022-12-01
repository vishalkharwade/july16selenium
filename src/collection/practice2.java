package collection;

import java.util.ArrayList;
import java.util.Iterator;

public class practice2 {
	
	public static void main(String[] args) {
		 ArrayList v1=new ArrayList();
		 
		 v1.add("velocity");
		 v1.add(122);
		 v1.add('V');
		 v1.add(12.7f);
		 v1.add(null);
		 v1.add(null);
		  System.out.println(v1);
		  System.out.println(v1.size());
		  System.out.println(v1.isEmpty());
		  System.out.println(v1.contains(122));
		  System.out.println(v1.get(3));
		  
		  System.out.println("--right shift operation--");
		  v1.add(4, "vishal");
		  System.out.println(v1);
		  System.out.println("left shift operation");
		  v1.remove(4);
		  System.out.println(v1);
		  
		  System.out.println("--update---");
		  v1.set(1, 999);
		  System.out.println(v1);
		  System.out.println("--iterator cursor--");
		  
		  Iterator it=v1.iterator();
		  while(it.hasNext()) {
			  System.out.println(it.next());
		  }
		  System.out.println("--*-for loop-*--");
		  for(int i=0;i<=v1.size()-1;i++) {
			  System.out.println(v1.get(i));
		  }
		  System.out.println("**---For each----**");
		  for(Object w:v1) {
			  System.out.println(w);
		  }
		  
		  
		  
		  
		  
		  
		  
	}

}
