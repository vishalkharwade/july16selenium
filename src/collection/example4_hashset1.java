package collection;

import java.util.HashSet;
import java.util.Iterator;

public class example4_hashset1 {
	public static void main(String[] args) {
		HashSet hs=new HashSet();
		
		hs.add("vihsal");
		hs.add(101);
		hs.add('A');
		hs.add(66.8);
		hs.add(101);
		hs.add(null);
		hs.add(null);
		
		System.out.println(hs.size());
		System.out.println(hs);
		System.out.println(hs.isEmpty());
		System.out.println(hs.contains(101));
		
		//remove info from hashset
		hs.remove('A');
		System.out.println(hs);
		System.out.println("--print all data from hashset using iterator--");
		
	Iterator itr = hs.iterator();
	while(itr.hasNext()) {
		System.out.println(itr.next());
	}
		System.out.println("print all dadta using foreach");
		for(Object s1:hs) {
			System.out.println(s1);
		}
		
		
	}

}
