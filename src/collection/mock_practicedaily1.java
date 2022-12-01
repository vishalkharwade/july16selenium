package collection;

import java.util.LinkedList;
import java.util.ListIterator;

public class mock_practicedaily1 {
	public static void main(String[] args) {
		LinkedList LL=new LinkedList();
		//id,ename,eposition,eaddress
		LL.add(12);
		LL.add("vishal");
		LL.add("senior tester");
		LL.add("pune");
		
		//add,add in between,remove,use iterator
		
		System.out.println(LL);
		LL.add(1, "rahul");
		System.out.println(LL);
		System.out.println("__in btn__");
		LL.remove(1);
		System.out.println(LL);
		System.out.println("using iterator");
		
		ListIterator demo = LL.listIterator();
		while(demo.hasNext()) {
			System.out.println(demo.next());
		}
		System.out.println("__using loop__");
		for(int i=0;i<=LL.size()-1;i++) {
			System.out.println(LL.get(i));
		}
	
	}

}
