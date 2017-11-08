package com.scp.set.userdefined.sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


public class TestSorting {

	public static void main(String[] args) {
		
		
		Product p1 = new Product(10,"xnmahsjd",123);
		Product p2 = new Product(1,"xNmahsjd",2543);
		Product p3 = new Product(12,"Pakcks",7643);
		Product p4 = new Product(9,"asd123",2367);
		Product p5 = new Product(1120,"dasd1",23);
		
		
		List<Product> listOfProducts = new ArrayList<Product>();
		listOfProducts.add(p1);
		listOfProducts.add(p2);
		listOfProducts.add(p3);
		listOfProducts.add(p4);
		listOfProducts.add(p5);
		listOfProducts.add(p1);
		
		System.out.println("Unsorted --"+listOfProducts);
		
		Collections.sort(listOfProducts,p1.NameCompare);//Merge sort--- if no elements are less=7 insertion sort
		System.out.println("Sorted By Name -- "+listOfProducts);
		
		Collections.sort(listOfProducts,p1.idCompare);//Merge sort--- if no elements are less=7 insertion sort
		System.out.println("Sorted By Id -- "+listOfProducts);
		
		//Collections.sort(listOfProducts,p1.priceCompare);//Merge sort--- if no elements are less=7 insertion sort
		System.out.println("Sorted By Price -- "+listOfProducts);
		
		
	}
	
}


/**
 * 
 * @author Yogesh
 *
 */



class ProductNameCompare implements Comparator<Product>{

	@Override
	public int compare(Product p1, Product p2) {
		return p1.getProductName().compareTo(p2.getProductName());
	}
	
}

class ProductIdCompare implements Comparator<Product>{
	@Override
	public int compare(Product p1, Product p2) {
		return p1.getProductId()-p2.getProductId();
	}
	
}

class ProductPriceCompare implements Comparator<Product>{
	@Override
	public int compare(Product p1, Product p2) {
		return (int) (p1.getProductPrice()-p2.getProductPrice());
	}
}









