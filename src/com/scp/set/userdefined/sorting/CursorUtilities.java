package com.scp.set.userdefined.sorting;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
/**
 * 
 * T - Type
 * E - Elements
 * K - Key
 * V - Value
 * 
 * 
 * @author Yogesh
 *
 *? -- NO Bound -- can accept any type of object
 *? extends List --- Upper bound -- Can accept list type of objects
 *? super List --- Lower bound -- Can accept list parent types
 *
 */
public class CursorUtilities {
	public static <T extends List<Object>>void myListIterator(T t){
		System.out.println("Iterating using generic MyListIterator--");
		@SuppressWarnings("rawtypes")
		ListIterator litr = t.listIterator();
		iterateValues(litr);
	}
	
	private static <T extends Iterator<? extends Object>>void iterateValues(T t) {
		ListIterator litstItr=null;
		Iterator itr=null;
		
		if(t instanceof ListIterator){
			litstItr = (ListIterator)t;
			while(litstItr.hasNext()){
				Object o= litstItr.next();
				if(o instanceof Product){
					Product pp = (Product)o;
					System.out.print(" ID --"+pp.getProductId());
					System.out.print("|| NAME --"+pp.getProductName());
					System.out.print("|| PRICE --"+pp.getProductPrice());
					System.out.println("-----------------------------");
				}
			}
		}else{
			itr = (Iterator)t;
			while(itr.hasNext()){
				Object o= itr.next();
				if(o instanceof Product){
					Product pp = (Product)o;
					System.out.print(" ID --"+pp.getProductId());
					System.out.print("|| NAME --"+pp.getProductName());
					System.out.print("|| PRICE --"+pp.getProductPrice());
					System.out.println("-----------------------------");
				}
		}

		}
		
	}	
		

	public static <T extends Collection<? extends Object>>void myIterator(T t){
		System.out.println("Iterating using generic MyIterator--");
		@SuppressWarnings("rawtypes")
		Iterator itr = t.iterator();
		iterateValues(itr);
	}
	
	
	


}
