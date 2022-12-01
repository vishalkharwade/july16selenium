package collection;

import java.util.LinkedList;
import java.util.ListIterator;

public class example3_linkedList {
	public static void main(String[] args) {
		
		LinkedList LL=new LinkedList();
		
		LL.add("vishal");
		LL.add(12);
		LL.add('A');
		LL.add(55.8f);
		LL.add(null);
		LL.add(null);
		
		
		System.out.println(LL);
		System.out.println(LL.size());
		System.out.println(LL.isEmpty());
		System.out.println(LL.contains('A'));
		System.out.println(LL.get(3));
		System.out.println(LL);
		//add info btn linked list
		LL.add(3, 88.7f);
		System.out.println(LL);
		//remove btn 
		LL.remove(3);
		System.out.println(LL);
		
		//modify info
		LL.set(1, 99);
		System.out.println(LL);
		
		System.out.println("---print all data using Itrator cursor---");
	ListIterator itr = LL.listIterator()	;
	while(itr.hasNext()) {
		System.out.println(itr.next());
	}
	System.out.println("print all datda using for Each");	
		for(Object s1:LL) {
			System.out.println(s1);
		
		}
		System.out.println("--print all data using for loop--");
		
		for(int i=0;i<=LL.size()-1;i++) {
			System.out.println(LL.get(i));
		}
		
		
		
		
		
		
	}

}
