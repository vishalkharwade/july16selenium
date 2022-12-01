package collection;

import java.util.ArrayList;
import java.util.EventObject;
import java.util.Iterator;
import java.util.Objects;

public class example1_ArrayList {
	
	public static void main(String[] args) {
		
		ArrayList al=new ArrayList();
		al.add("vishal");
		al.add(101);
		al.add('A');
	    al.add(66.6f);
	    al.add(null);
	    al.add(null);
	    al.add("vishal");
	    
	    
	    System.out.println(al);
         System.out.println(al.size());
         System.out.println(al.isEmpty());//false
         System.out.println(al.contains(101));//true
         System.out.println(al.get(3));//66.6
//remove info in between arraylist-->left shift operation
         al.remove(4);
         System.out.println(al);
		//add info in between arrays list 
         //-->right shift operation
         al.add(4, "akshay");
         System.out.println(al);
         //update modify info from array list
         al.set(1, 99);
         System.out.println(al);
        
  System.out.println("--print all info from arraylistn using iterator cursor--");
   
  Iterator itr=al.iterator();
  while(itr.hasNext()) {
	  
	  System.out.println(itr.next());
	  
	  System.out.println("--print all data using loop--");
	  for(int i=0;i<=al.size()-1;i++) {
		  System.out.println(al.get(i));
		 
		  
		  System.out.println("-using foreach loop-;");
	for(Object s1:al) {
		System.out.println(s1);
	} 
   
   
   
	}
  
}}}
