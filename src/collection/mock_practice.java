package collection;

import java.util.ArrayList;
import java.util.Iterator;

public class mock_practice {

	public static void main(String[] args) {
		
		ArrayList al=new ArrayList();
		al.add("vishal");
		al.add(12);
		al.add('B');
		al.add(66.8f);
		al.add(null);
		al.add(null);
		
		System.out.println(al);
		System.out.println(al.size());
		System.out.println(al.isEmpty());
		System.out.println(al.get(3));
		System.out.println(al.contains(12));
		
		
		System.out.println("--right shift operation--");
		al.add(4, "shital");
		System.out.println(al);
		
	al.remove(4);
		System.out.println(al);
		
		
		
		System.out.println("--update---");
		al.set(1, 24);
		System.out.println(al);
		
		System.out.println("--iterator cursor--");
		
		Iterator it=al.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		System.out.println("---for loop---");
		for(int i=0;i<=al.size()-1;i++) {
			System.out.println(al.get(i));
		}
		
		System.out.println("--for each--");
		for(Object s1:al) {
			System.out.println(s1);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
