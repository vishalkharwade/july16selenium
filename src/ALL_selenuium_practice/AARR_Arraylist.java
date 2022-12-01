package ALL_selenuium_practice;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class AARR_Arraylist {
	
	public static void main(String[] args) {
		
		ArrayList al=new ArrayList(10);
		
		al.add("Vishal");
		al.add(101);
		al.add('A');
		al.add(65.4f);
		al.add("vishal");
		al.add(null);
		al.add(null);
		
		System.out.println(al);
		System.out.println(al.size());
		
		System.out.println(al.isEmpty());
		System.out.println(al.contains(101));
		System.out.println(al.get(3));
		
		//Add info in between arraylist right shift operation
		
		System.out.println(al);
		al.add(3, "sameer");
		System.out.println(al);		
		System.out.println("-------------------");
		
		//remove info in between arraylist -->left shift operation
		al.remove(3);
		System.out.println(al);
		System.out.println("------------------");
		al.set(1, 55);
		System.out.println(al);
		System.out.println("*******************");
		System.out.println("Print All info from Arraylist Using iterator");
		Iterator itr = al.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
			
			System.out.println("____________");
			System.out.println("print all info from using Listiterrator cursor");
			
			ListIterator Litr = al.listIterator();
			while(Litr.hasNext()) {
				System.out.println(Litr.next());
				
				
				
				System.out.println("+++++++++++++++++++++");
			System.out.println("usin loop");	
			
			for(int i=0;i<=al.size()-1;i++) {
				System.out.println(al.get(i));
				
			}
			System.out.println("++++++++++++++++++++++++++");
			System.out.println("for each");
			for(Object sl:al) {
				System.out.println(sl);
			}
			
			
			
			
			}
			
			
		}
		
		
		
	}
	
	
	
	

}
