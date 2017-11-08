package com.scp.set.userdefined.sorting;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;


public class TestCursors {
	
	/**
	 * Iterator -- All collection Implelmented class, and you can use this on Map
	 * ListIterator -- All List implemented classes -- Arraylist vector linkedlist stack
	 * Enumeration -- Legacy classes -- Stack vector hashtable properties and dictionaries
	 * @param args
	 */
	
	public static void main(String[] args) {
		
		Product p1 = new Product(101,"A",1022);
		Product p2 = new Product(102,"B",22);
		Product p3 = new Product(103,"C",2122);
		
/*		
		ArrayList<Object> numbers = new ArrayList<>();
		numbers.add(p1);
		numbers.add(p2);
		numbers.add(p3);
		
		
		HashSet<Object> hset = new HashSet<>(numbers);
		System.out.println("Size----"+hset.size());
		
		CursorUtilities.myListIterator(numbers);
		CursorUtilities.myIterator(numbers);
		*/
		HashMap<Product,String> hmap = new HashMap<>();
		hmap.put(p1,"A");
		hmap.put(p2,"A");
		hmap.put(p3,"A");
		
		hmap.entrySet();//Set of entry object -- Key value hash next
		hmap.keySet();//Set of keys -- only key
		hmap.values();// will returns you the values
		
		
		Set<Product> setOfProduct = hmap.keySet();
		Iterator<Product> itr1 = setOfProduct.iterator();
		
		while(itr1.hasNext()){
			Product p = itr1.next();
			System.out.println("Key --" +p);
			System.out.println("Value --"+hmap.get(p));
		}
		
		
		Set<Entry<Product, String>>setOfEntryObjects = hmap.entrySet();
		Iterator<Entry<Product, String>> itr=setOfEntryObjects.iterator();
		while(itr.hasNext()){
			Entry<Product, String> entry = itr.next();
			System.out.println(entry.getKey());
			System.out.println(entry.getValue());
		}
		
		
	}

	
}
