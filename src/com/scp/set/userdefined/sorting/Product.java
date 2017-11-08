package com.scp.set.userdefined.sorting;

import java.util.Comparator;

public class Product {//implements Comparable<Product>{
	
	
	private int productId;
	private String productName;
	private long productPrice;
	/**
	 * @return the productId
	 */
	public int getProductId() {
		return productId;
	}
	/**
	 * @param productId the productId to set
	 */
	public void setProductId(int productId) {
		this.productId = productId;
	}
	/**
	 * @return the productName
	 */
	public String getProductName() {
		return productName;
	}
	/**
	 * @param productName the productName to set
	 */
	public void setProductName(String productName) {
		this.productName = productName;
	}
	/**
	 * @return the productPrice
	 */
	public long getProductPrice() {
		return productPrice;
	}
	/**
	 * @param productPrice the productPrice to set
	 */
	public void setProductPrice(long productPrice) {
		this.productPrice = productPrice;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "\nProduct [productId=" + productId + ", productName="
				+ productName + ", productPrice=" + productPrice + "]";
	}
	public Product(int productId, String productName, long productPrice) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.productPrice = productPrice;
	}
	
	//Annonoumous class implemetation for interface
	Comparator<Product> idCompare = new Comparator<Product>() {
		@Override
		public int compare(Product p1, Product p2) {
			return p1.getProductId()-p2.getProductId();
		}
		
	};
	
	
	Comparator<Product> NameCompare = new Comparator<Product>() {
		@Override
		public int compare(Product p1, Product p2) {
			return p1.getProductName().compareTo(p2.getProductName());
		}

		
	};
	
	
	
/*	Comparator<Product> priceCompare = new Comparator<Product>() {
		@Override
		public int compare(Product p1, Product p2) {
			return (int) (p1.getProductPrice()-p2.getProductPrice());
		}
		
	};
*/	
	
}
